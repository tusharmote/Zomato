package Models;

public class DeliveryPartner {
    int deliveryPartnerID;
    String deliveryPartnerName;
    Location deliveryPartnerLocation;

    public DeliveryPartner(int deliveryPartnerID, String deliveryPartnerName, Location deliveryPartnerLocation) {
        this.deliveryPartnerID = deliveryPartnerID;
        this.deliveryPartnerName = deliveryPartnerName;
        this.deliveryPartnerLocation = deliveryPartnerLocation;
    }

    public int getDeliveryPartnerID() {
        return deliveryPartnerID;
    }

    public void setDeliveryPartnerID(int deliveryPartnerID) {
        this.deliveryPartnerID = deliveryPartnerID;
    }

    public String getDeliveryPartnerName() {
        return deliveryPartnerName;
    }

    public void setDeliveryPartnerName(String deliveryPartnerName) {
        this.deliveryPartnerName = deliveryPartnerName;
    }

    public Location getDeliveryPartnerLocation() {
        return deliveryPartnerLocation;
    }

    public void setDeliveryPartnerLocation(Location deliveryPartnerLocation) {
        this.deliveryPartnerLocation = deliveryPartnerLocation;
    }
}
