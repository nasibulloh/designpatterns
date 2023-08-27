package uz.java.designpatterns.gof.structural.decorator;

class AdFreeStreamingDecorator extends StreamingServiceDecorator {
    public AdFreeStreamingDecorator(StreamingService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Ad-Free Streaming";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}