package Controller;

import Models.DeliveryMetaData;
import Models.Order;

import java.util.HashMap;

public class OrderManager {
    int order_id=1;
    FoodManager foodManager=FoodManager.getInstance();
    DeliveryManager deliveryManager=DeliveryManager.getInstance();
    BillGenerator billGenerator=BillGenerator.getInstance();
    HashMap<Integer, Order> order_list= new HashMap<>();
    public HashMap<Integer, Order> getOrders(){
        return order_list;
    }
    private OrderManager(){

    }
    private static OrderManager instance=null;
    public static OrderManager getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance=new OrderManager();
                    return instance;
                }
            }
        }
        return instance;
    }
     public void manageFood(Order order){
          //System.out.println(order.getOrder_id()+" "+order.getRestaurant().getName()+" "+order.getOrder_dishes());
        foodManager.prepareFood(order.getOrder_id(),order.getRestaurant().getName(),order.getOrder_dishes());
     }

    public void manageDelivery(Order order){
        DeliveryMetaData metaData=new DeliveryMetaData(order.getOrder_id(),order.getUser().getUser_location(), order.getRestaurant().getRestaurant_location());
        deliveryManager.manageDelivery(metaData);
    }

    public HashMap<Integer, Order> getOrder_list() {
        return order_list;
    }

    public void setOrder_list(Order order) {
         order_list.put(order.getOrder_id(),order);
    }
    public void generateBill(Order order){
        billGenerator.displayBill(order);
    }
    public void createOrder(Order order){
        manageFood(order);
        manageDelivery(order);
        generateBill(order);
    }

}
