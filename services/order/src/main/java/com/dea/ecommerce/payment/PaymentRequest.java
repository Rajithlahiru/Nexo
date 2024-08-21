package com.dea.ecommerce.payment;

import com.dea.ecommerce.customer.CustomerResponse;
import com.dea.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
