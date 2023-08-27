package uz.java.designpatterns.gof.behivioral.mediator;

public interface AirTrafficControl {
    void requestLanding(Aircraft aircraft);
    void registerAircraft(Aircraft aircraft);
}