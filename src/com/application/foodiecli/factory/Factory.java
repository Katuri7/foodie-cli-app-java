package com.trainingmug.foodiecli.factory;

import com.trainingmug.foodiecli.controller.CustomerController;
import com.trainingmug.foodiecli.controller.DishController;
import com.trainingmug.foodiecli.controller.OrderController;
import com.trainingmug.foodiecli.controller.RestaurantController;
import com.trainingmug.foodiecli.repository.CustomerRepository;
import com.trainingmug.foodiecli.repository.DishRepository;
import com.trainingmug.foodiecli.repository.OrderRepository;
import com.trainingmug.foodiecli.repository.RestaurantRepository;
import com.trainingmug.foodiecli.service.CustomerServiceImpl;
import com.trainingmug.foodiecli.service.DishServiceImpl;
import com.trainingmug.foodiecli.service.OrderServiceImpl;
import com.trainingmug.foodiecli.service.RestaurantServiceImpl;
import com.trainingmug.foodiecli.util.CsvReader;

public class Factory {

    public static CsvReader getCsvReader() {
        return Holder.CSV_READER;
    }

    public static CustomerRepository getCustomerRepository() {
        return Holder.CUSTOMER_REPOSITORY;
    }

    public static CustomerServiceImpl getCustomerService() {
        return Holder.CUSTOMER_SERVICE;
    }

    public static CustomerController getCustomerController() {
        return Holder.CUSTOMER_CONTROLLER;
    }

    public static DishRepository getDishRepository() {
        return Holder.DISH_REPOSITORY;
    }

    public static DishServiceImpl getDishService() {
        return Holder.DISH_SERVICE;
    }

    public static DishController getDishController() {
        return Holder.DISH_CONTROLLER;
    }

    public static RestaurantRepository getRestaurantRepository() {
        return Holder.RESTAURANT_REPOSITORY;
    }

    public static RestaurantServiceImpl getRestaurantService() {
        return Holder.RESTAURANT_SERVICE;
    }

    public static RestaurantController getRestaurantController() {
        return Holder.RESTAURANT_CONTROLLER;
    }

    public static OrderRepository getOrderRepository() {
        return Holder.ORDER_REPOSITORY;
    }

    public static OrderServiceImpl getOrderService() {
        return Holder.ORDER_SERVICE;
    }

    public static OrderController getOrderController() {
        return Holder.ORDER_CONTROLLER;
    }

    private static class Holder {

        private static final CsvReader CSV_READER = new CsvReader();

        private static final CustomerRepository CUSTOMER_REPOSITORY = new CustomerRepository();
        private static final CustomerServiceImpl CUSTOMER_SERVICE = new CustomerServiceImpl(CUSTOMER_REPOSITORY);
        private static final CustomerController CUSTOMER_CONTROLLER = new CustomerController(CUSTOMER_SERVICE);

        private static final DishRepository DISH_REPOSITORY = new DishRepository();
        private static final DishServiceImpl DISH_SERVICE = new DishServiceImpl(DISH_REPOSITORY);
        private static final DishController DISH_CONTROLLER = new DishController(DISH_SERVICE);

        private static final RestaurantRepository RESTAURANT_REPOSITORY = new RestaurantRepository();
        private static final RestaurantServiceImpl RESTAURANT_SERVICE = new RestaurantServiceImpl(RESTAURANT_REPOSITORY);
        private static final RestaurantController RESTAURANT_CONTROLLER = new RestaurantController(RESTAURANT_SERVICE);

        private static final OrderRepository ORDER_REPOSITORY = new OrderRepository();
        private static final OrderServiceImpl ORDER_SERVICE = new OrderServiceImpl(ORDER_REPOSITORY);
        private static final OrderController ORDER_CONTROLLER = new OrderController(ORDER_SERVICE);

    }


}