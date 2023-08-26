package uz.java.designpatterns.gof.structural.decorator;

public class BasicStreamingService implements StreamingService {
    @Override
    public String getDescription() {
        return "Basic Streaming Service";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}