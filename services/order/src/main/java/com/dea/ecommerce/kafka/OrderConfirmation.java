package com.dea.ecommerce.kafka;

import com.dea.ecommerce.customer.CustomerResponse;
import com.dea.ecommerce.order.PaymentMethod;
import com.dea.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> product
) {
}
