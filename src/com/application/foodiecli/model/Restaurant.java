package com.application.foodiecli.model;

import java.util.List;
import java.util.Objects;

public class Restaurant {
       /*
    add the following properties
    --------------------------------------
    Datatype                  variable
    --------------------------------------
    String                      id
    String                      name
    String                      address
    List<String>                menu
     */

    /*
    1. All the fields should be private
    2. Create only no-arg constructor
    3. Create Getters and Setter methods
    4. Override hashCode() and equals() methods
    5. Override toString() methods
     */

    private String id;
    private String name;
    private String address;
    private List<String> menu;

    // Getter for restaurantId
    public String getId() {
        return id;
    }

    // Setter for restaurantId
    public Restaurant setId(String id) {
        this.id = id;
        return this;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public Restaurant setAddress(String address) {
        this.address = address;
        return this;
    }

    // Getter for menu
    public List<String> getMenu() {
        return menu;
    }

    // Setter for menu
    public Restaurant setMenu(List<String> menu) {
        this.menu = menu;
        return this;
    }



    // Overriding hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, menu);
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
        Restaurant restaurant = (Restaurant) obj;
        return Objects.equals(id, restaurant.id) &&
                Objects.equals(name, restaurant.name) &&
                Objects.equals(address, restaurant.address) &&
                Objects.equals(menu, restaurant.menu);
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }

}
