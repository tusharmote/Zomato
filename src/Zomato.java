import Controller.BillGenerator;
import Controller.DeliveryPartnerManager;
import Controller.OrderManager;
import Controller.RestaurantManager;
import Models.*;

import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zomato {
    public static void main(String[] args){
        //Adding Users
        User tushar=new User(1,"tushar",new Location(0,0));
        User rushi=new User(2,"rushi",new Location(1,1));
        User hritik=new User(3,"hritik",new Location(2,2));

        //Creating Restaurants
        Restaurant north=new Restaurant(1,"north",new Location(3,3), Rating.GOOD);
        Restaurant south=new Restaurant(2,"south",new Location(4,4), Rating.GOOD);
        RestaurantManager restaurantManager=RestaurantManager.getInstance();
        restaurantManager.addRestaurant(north);
        restaurantManager.addRestaurant(south);

        DeliveryPartner abc=new DeliveryPartner(1,"ABC",new Location(6,6));
        DeliveryPartnerManager deliveryPartnerManager=DeliveryPartnerManager.getInstance();
        deliveryPartnerManager.addDeliveryPartner(abc);

        //Creating Dishes
        Dish idli=new Dish("Idli",300);
        Dish dosa=new Dish("Dosa",200);
        Dish vada=new Dish("Vada",400);
        Dish poha=new Dish("Poha",500);

        //Creating Menu
        Menu menu1=new Menu();
        menu1.addDishes(idli);
        menu1.addDishes(dosa);
        menu1.addDishes(poha);
        north.addMenu(menu1);
        HashMap<Dish,Integer> order_dishes=new HashMap<>();
        order_dishes.put(idli,2);
        order_dishes.put(dosa,3);
        Order order1=new Order(tushar,north,order_dishes);
        OrderManager orderManager=OrderManager.getInstance();
        orderManager.setOrder_list(order1);
        orderManager.createOrder(order1);
        //System.out.println(orderManager==null);
        //orderManager.manageDelivery(order1);
        //orderManager.generateBill(order1);
        //BillGenerator billGenerator=new BillGenerator(order1.getOrder_id())
    }
}