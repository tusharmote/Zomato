package Services;

import Controller.DeliveryPartnerManager;
import Models.DeliveryMetaData;
import Models.DeliveryPartner;

import java.util.HashMap;

public class LocBasedPartnerFindingStrategy implements PartnerFindingStrategy{
    HashMap<Integer,DeliveryPartner> foundPartners = new HashMap<>();
    DeliveryPartnerManager deliveryPartnerManager=DeliveryPartnerManager.getInstance();
    public HashMap<Integer, DeliveryPartner> findPartner(DeliveryMetaData metaData) {
           System.out.println("Finding Based on the nearest partners available : ");
           foundPartners.put(1,deliveryPartnerManager.getDeliveryPartnerHashMap().get("ABC"));
           return foundPartners;
    }

}
