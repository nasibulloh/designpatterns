package uz.java.designpatterns.solid.dependecyinversion.correct;

public class DeliveryManager {
    private final DeliveryService service;

    public DeliveryManager(DeliveryService service) {
        this.service = service;
    }

    public void doDelivery() {
        service.deliver();
    }
}
