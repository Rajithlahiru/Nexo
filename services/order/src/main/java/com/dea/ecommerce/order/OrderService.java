package com.dea.ecommerce.order;

import com.dea.ecommerce.customer.CustomerClient;
import com.dea.ecommerce.exception.BusinessException;
import com.dea.ecommerce.orderline.OrderLineRequest;
import com.dea.ecommerce.orderline.OrderLineService;
import com.dea.ecommerce.product.ProductClient;
import com.dea.ecommerce.product.PurchaseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;
    public Integer createdOrder(OrderRequest request) {
        //check the customer --> OpenFeign
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No customer exists with the provided ID"));

        //purchase the product --> product-ms (RestTemplate)
        this.productClient.purchaseProduct(request.products());

        //persist order
        var order = this.repository.save(mapper.toOrder(request));

        //persist order lines
        for (PurchaseRequest purchaseRequest: request.products()){
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )
            );
        }

        //start payment process

        //send the order confirmation --> notification-ms (kafka)
        return null;
    }
}
