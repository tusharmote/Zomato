package Controller;

import Models.Dish;
import Models.Order;
import Models.Restaurant;
import Models.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BillGenerator {
    int order_id;
    HashMap<Dish,Integer> dishes=new HashMap<>();
    int total_price=0;
    //OrderManager orderManager=OrderManager.getInstance();
    private BillGenerator(){

    }

    private static BillGenerator instance=null;
    public static BillGenerator getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance=new BillGenerator();
                    return instance;
                }
            }
        }
        return instance;
    }
    public void displayBill(Order order){
        //Order order=orderManager.getOrder_list().get(order_id);
        User user=order.getUser();
        Restaurant restaurant=order.getRestaurant();
        dishes=order.getOrder_dishes();
        Iterator itr=dishes.entrySet().iterator();
        System.out.println("");
        System.out.println("***************************************");
        System.out.println("Bill for order : "+ order.getOrder_id());
        System.out.println("Customer name : "+ user.getUser_name());
        System.out.println("Ordered from : "+ restaurant.getName());
        System.out.println("---------Order Details----------");
        while(itr.hasNext()){
            Map.Entry mapElement
                    = (Map.Entry)itr.next();
            Dish dish=(Dish)mapElement.getKey();
            int quantity=(int)mapElement.getValue();
            int price=quantity*dish.getPrice();
            total_price+=price;
            System.out.println(dish.getDish_name()+"     Quantity: "+quantity+"       Price:"+price);

        }
        System.out.println("Total price to be paid: "+total_price);
        System.out.println("--------------------------------");


    }
}
