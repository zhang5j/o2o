package com.zz.o2o.exceptions;

public class ShopOperationException extends RuntimeException{

    private static final long serialVersionUID = 3607455068152902240L;

    public ShopOperationException(String msg) {
        super(msg);
    }
}
