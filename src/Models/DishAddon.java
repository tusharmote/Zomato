package Models;

public class DishAddon {
    String addon_name;
    Menu menu;
    int price;

    public DishAddon(String addon_name, int price) {
        this.addon_name = addon_name;
        this.price = price;
    }
}
