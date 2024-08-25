package com.trainingmug.foodiecli.controller;

import com.trainingmug.foodiecli.exceptions.OrderExistsException;
import com.trainingmug.foodiecli.exceptions.OrderNotFoundException;
import com.trainingmug.foodiecli.model.Order;
import com.trainingmug.foodiecli.service.OrderServiceImpl;

import java.util.List;

public class OrderController {

    private OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    public List<Order> getOrdersList(){
        return this.orderService.getOrdersList();
    }

    public Order getOrderById(String id) throws OrderNotFoundException {
        return this.orderService.getOrderById(id);
    }

    public Order saveOrder(Order order) throws OrderExistsException {
        return this.orderService.save(order);
    }
}