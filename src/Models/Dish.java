package Models;

import java.util.HashMap;

public class Dish {
    Menu menu;
    String dish_name;
    int price;

    HashMap<String,DishAddon> dishAddon=new HashMap<String, DishAddon>();

    public Dish(String dish_name, int price) {
        this.dish_name = dish_name;
        this.price = price;
    }

    public String getDish_name() {
        return dish_name;
    }

    public int getPrice() {
        return price;
    }
}
