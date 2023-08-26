package uz.java.designpatterns.gof.structural.decorator;

public abstract class StreamingServiceDecorator implements StreamingService {
    protected StreamingService decoratedService;

    public StreamingServiceDecorator(StreamingService decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedService.getCost();
    }
}
