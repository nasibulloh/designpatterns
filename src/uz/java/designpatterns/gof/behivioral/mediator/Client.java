package uz.java.designpatterns.gof.behivioral.mediator;

public class Client {
    public static void main(String[] args) {
        AirTrafficControlCenter controlCenter = new AirTrafficControlCenter();

        Aircraft aircraft1 = new Aircraft("Flight 101", controlCenter);
        Aircraft aircraft2 = new Aircraft("Flight 202", controlCenter);

        aircraft1.requestLanding();
        aircraft2.requestLanding();
    }
}
