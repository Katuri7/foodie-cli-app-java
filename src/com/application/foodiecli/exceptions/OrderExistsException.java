package com.trainingmug.foodiecli.exceptions;

public class OrderExistsException extends Exception{

    public OrderExistsException(String message) {
        super(message);
    }
}