package uz.java.designpatterns.gof.structural.decorator;

public class HDStreamingDecorator extends StreamingServiceDecorator {
    public HDStreamingDecorator(StreamingService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + HD Streaming";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}


