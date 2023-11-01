package com.ead.posproduct;

public class ProductNotFountException extends RuntimeException {
    public ProductNotFountException(String message) {
        super(message);
    }
}
