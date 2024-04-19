package Controller;

import Models.Restaurant;

import java.util.HashMap;

public class RestaurantManager {
    HashMap<String, Restaurant> restaurant_list=new HashMap<>();
    private RestaurantManager(){

    }
    static RestaurantManager instance=null;
    public  static RestaurantManager getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance= new RestaurantManager();
                    return instance;
                }
            }
        }
        return instance;
    }

    public HashMap<String, Restaurant> getRestaurant_list() {
        return restaurant_list;
    }

    public void setRestaurant_list(HashMap<String, Restaurant> restaurant_list) {
        this.restaurant_list = restaurant_list;
    }
    public void addRestaurant(Restaurant restaurant){
        restaurant_list.put(restaurant.getName(), restaurant);
    }
}
