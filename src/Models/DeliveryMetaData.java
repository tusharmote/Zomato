package Models;

public class DeliveryMetaData {
    Order order;
    User user;
    Restaurant restaurant;
    int order_id;
    Location user_location;
    Location restaurant_location;

    public DeliveryMetaData(int order_id, Location user_location, Location restaurant_location) {
        this.order_id = order_id;
        this.user_location = user_location;
        this.restaurant_location = restaurant_location;

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Location getUser_location() {
        return user_location;
    }

    public void setUser_location(Location user_location) {
        this.user_location = user_location;
    }

    public Location getRestaurant_location() {
        return restaurant_location;
    }

    public void setRestaurant_location(Location restaurant_location) {
        this.restaurant_location = restaurant_location;
    }
}
