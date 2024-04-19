package Models;

import java.util.HashMap;

public class Menu {
    String menu_name;
    Restaurant restaurant;
    HashMap<String,Dish> dishes=new HashMap<String, Dish>();
    public void addDishes(Dish dish){
        dishes.put(dish.getDish_name(),dish);
    }

}
