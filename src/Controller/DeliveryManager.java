package Controller;

import Models.DeliveryMetaData;
import Models.DeliveryPartner;
import Models.Restaurant;
import Services.PartnerFindingStrategy;
import Services.PartnerFindingStrategyFactory;

import java.util.HashMap;

public class DeliveryManager {
    private DeliveryManager(){
        
    }
    private static DeliveryManager instance=null;
    public static DeliveryManager getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance=new DeliveryManager();
                    return instance;
                }
            }
        }
        return instance;
    }
    public void manageDelivery(DeliveryMetaData metaData){
        PartnerFindingStrategy partnerFindingStrategy= PartnerFindingStrategyFactory.getPartnerFindingStrategy();
        HashMap<Integer, DeliveryPartner> foundPartners=partnerFindingStrategy.findPartner(metaData);
        System.out.println("Partner Found");
        //System.out.println(foundPartners);
        DeliveryPartner partner=foundPartners.get(1);
        //System.out.println(partner==null);
        System.out.println("Our Delivery Partner "+ partner.getDeliveryPartnerName()+" is carrying your order with orderId: "+ metaData.getOrder_id());
    }
}
