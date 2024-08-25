package com.trainingmug.foodiecli.exceptions;

public class OrderNotFoundException extends Exception{

    public OrderNotFoundException(String message) {
        super(message);
    }
}