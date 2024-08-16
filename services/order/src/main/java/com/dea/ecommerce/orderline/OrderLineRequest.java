package com.dea.ecommerce.orderline;

public record OrderLineRequest(
        Integer id,
        Integer orderID,
        Integer productID,
        double quantity
) {
}
