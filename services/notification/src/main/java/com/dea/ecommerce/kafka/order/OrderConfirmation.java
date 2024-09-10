package com.dea.ecommerce.kafka.order;

import com.dea.ecommerce.kafka.payment.PaymentMethod;
import java.util.List;
import java.math.BigDecimal;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products
) {
}
