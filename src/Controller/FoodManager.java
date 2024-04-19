package Controller;

import Models.Dish;
import Models.Restaurant;

import java.util.HashMap;

public class FoodManager {
    RestaurantManager restaurantManager=RestaurantManager.getInstance();
    private FoodManager(){

    }
    private static FoodManager instance=null;
    public static FoodManager getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance=new FoodManager();
                    return instance;
                }
            }
        }
        return instance;
    }
    public void prepareFood(int order_id , String restaurant_name, HashMap<Dish,Integer> dishes){
        //System.out.println(order_id+" "+restaurant_name+" "+dishes);
         Restaurant restaurant=restaurantManager.getRestaurant_list().get(restaurant_name);
         restaurant.prepareFood(order_id,dishes);
    }
}
