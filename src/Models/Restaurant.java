package Models;

import java.util.HashMap;

public class Restaurant {
    int restaurant_id;
    String name;
    Location restaurant_location;
    Rating restaurant_rating;
    Menu menu;

    public Restaurant(int restaurant_id, String name, Location restaurant_location, Rating restaurant_rating) {
        this.restaurant_id = restaurant_id;
        this.name = name;
        this.restaurant_location = restaurant_location;
        this.restaurant_rating = restaurant_rating;
    }
    public void addMenu(Menu menu){
        this.menu=menu;
    }

    public void prepareFood(int order_id, HashMap<Dish,Integer> dishes){
        System.out.println("Preparing food for order id = "+order_id);

    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getRestaurant_location() {
        return restaurant_location;
    }

    public void setRestaurant_location(Location restaurant_location) {
        this.restaurant_location = restaurant_location;
    }

    public Rating getRestaurant_rating() {
        return restaurant_rating;
    }

    public void setRestaurant_rating(Rating restaurant_rating) {
        this.restaurant_rating = restaurant_rating;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
