package com.dea.ecommerce.orderline;

import com.dea.ecommerce.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.id())
                .quantity(request.quantity())
                .order(
                        Order.builder()
                                .id(request.orderID())
                                .build()
                )
                .productID(request.productID())
                .build();
    }
}
