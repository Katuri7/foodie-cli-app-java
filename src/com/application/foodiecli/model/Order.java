package com.trainingmug.foodiecli.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {

   /*
    add the following properties
    --------------------------------------
    Datatype                  variable
    --------------------------------------
    String                      id
    Customer                    customer
    Restaurant                  restaurant
    List<Dish>                  dishes
    double                      price
     */

    /*
    1. All the fields should be private
    2. Create only no-arg constructor
    3. Create Getters and Setter methods
    4. Override hashCode() and equals() methods
    5. Override toString() methods
     */

    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishList;
    private double totalPrice;
    private LocalDate orderDate;

    // Constructor


    // Getter for orderId
    public String getId() {
        return id;
    }

    // Setter for orderId
    public Order setId(String id) {
        this.id = id;
        return this;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter for customer
    public Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    // Getter for restaurant
    public Restaurant getRestaurant() {
        return restaurant;
    }

    // Setter for restaurant
    public Order setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    // Getter for dishes
    public List<Dish> getDishList() {
        return dishList;
    }

    // Setter for dishes
    public Order setDishList(List<Dish> dishList) {
        this.dishList = dishList;
        return this;
    }

    // Getter for totalPrice
    public double getTotalPrice() {
        return totalPrice;
    }

    // Setter for totalPrice
    public Order setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    // Getter for orderDate
    public LocalDate getOrderDate() {
        return orderDate;
    }

    // Setter for orderDate
    public Order setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    // Overriding hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, customer, restaurant, dishList, totalPrice, orderDate);
    }

    // Overriding equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;
        return Double.compare(order.totalPrice, totalPrice) == 0 &&
                Objects.equals(id, order.id) &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(restaurant, order.restaurant) &&
                Objects.equals(dishList, order.dishList) &&
                Objects.equals(orderDate, order.orderDate);
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Order{" +
                " id ='" + id + '\'' +
                ", customer=" + customer +
                ", restaurant=" + restaurant +
                ", dishes=" + dishList +
                ", totalPrice=" + totalPrice +
                ", orderDate=" + orderDate +
                '}';
    }
}