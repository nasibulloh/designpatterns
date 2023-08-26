package uz.java.designpatterns.gof.structural.decorator;

public class Main {
    public static void main(String[] args) {
        StreamingService basicService = new BasicStreamingService();
        System.out.println("Basic Service: " + basicService.getDescription() + ", Cost: $" + basicService.getCost());

        StreamingService hdService = new HDStreamingDecorator(basicService);
        System.out.println("HD Service: " + hdService.getDescription() + ", Cost: $" + hdService.getCost());

        StreamingService adFreeHDService = new AdFreeStreamingDecorator(hdService);
        System.out.println("Ad-Free HD Service: " + adFreeHDService.getDescription() + ", Cost: $" + adFreeHDService.getCost());
    }
}
