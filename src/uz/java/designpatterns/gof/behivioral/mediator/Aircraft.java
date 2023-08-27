package uz.java.designpatterns.gof.behivioral.mediator;

public class Aircraft {
    private String callsign;
    private AirTrafficControl mediator;

    public Aircraft(String callsign, AirTrafficControl mediator) {
        this.callsign = callsign;
        this.mediator = mediator;
        mediator.registerAircraft(this);
    }

    public String getCallsign() {
        return callsign;
    }

    public AirTrafficControl getMediator() {
        return mediator;
    }

    public void requestLanding() {
        mediator.requestLanding(this);
    }

    public void receiveLandingClearance() {
        System.out.println(callsign + ": Received landing clearance.");
    }
}