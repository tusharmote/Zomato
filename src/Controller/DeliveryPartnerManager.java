package Controller;

import Models.DeliveryPartner;

import java.util.HashMap;

public class DeliveryPartnerManager {
    HashMap<String, DeliveryPartner> deliveryPartnerHashMap=new HashMap<>();
    private DeliveryPartnerManager(){

    }
    private static DeliveryPartnerManager instance=null;
    public static DeliveryPartnerManager getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance=new DeliveryPartnerManager();
                    return instance;
                }
            }
        }
        return instance;
    }
    public void addDeliveryPartner(DeliveryPartner deliveryPartner){
          deliveryPartnerHashMap.put(deliveryPartner.getDeliveryPartnerName(),deliveryPartner);
    }

    public HashMap<String, DeliveryPartner> getDeliveryPartnerHashMap() {
        return deliveryPartnerHashMap;
    }
}

