package uz.java.designpatterns.gof.behivioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlCenter implements AirTrafficControl {
    private final List<Aircraft> aircraftList = new ArrayList<>();

    @Override
    public void requestLanding(Aircraft aircraft) {
        if (aircraftList.contains(aircraft)) {
            System.out.println("Landing clearance granted for " + aircraft.getCallsign());
            aircraft.receiveLandingClearance();
        } else {
            System.out.println("Unknown aircraft: " + aircraft.getCallsign());
        }
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }
}