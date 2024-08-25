package com.trainingmug.foodiecli.service;

import com.trainingmug.foodiecli.exceptions.OrderExistsException;
import com.trainingmug.foodiecli.exceptions.OrderNotFoundException;
import com.trainingmug.foodiecli.model.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getOrdersList();
    public Order getOrderById(String id) throws OrderNotFoundException;
    public Order save(Order order) throws OrderExistsException;


}