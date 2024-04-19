package Models;

import java.util.HashMap;

public class Order {
    int order_id=0;
    User user;
    Restaurant restaurant;
    HashMap<Dish,Integer> order_dishes=new HashMap<>();

    public Order(User user, Restaurant restaurant, HashMap<Dish, Integer> order_dishes) {
        this.user = user;
        this.restaurant = restaurant;
        this.order_dishes = order_dishes;
        order_id++;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public HashMap<Dish, Integer> getOrder_dishes() {
        return order_dishes;
    }

    public void setOrder_dishes(HashMap<Dish, Integer> order_dishes) {
        this.order_dishes = order_dishes;
    }
}

