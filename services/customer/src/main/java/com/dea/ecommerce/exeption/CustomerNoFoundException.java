package com.dea.ecommerce.exeption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNoFoundException extends RuntimeException {
    private final String msg;
}

