package Services;

import Models.DeliveryMetaData;
import Models.DeliveryPartner;

import java.util.HashMap;

public interface PartnerFindingStrategy {
    HashMap<Integer, DeliveryPartner> findPartner(DeliveryMetaData metaData);
}
