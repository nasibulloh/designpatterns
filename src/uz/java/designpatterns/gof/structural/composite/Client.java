package uz.java.designpatterns.gof.structural.composite;

class Client {
    public static void main(String[] args) {
        EventPublisher publisher1 = new TttlEventPublisher();
        EventPublisher publisher2 = new TttlEventPublisher();

        CompositeEventPublisher compositeEventPublisher = new CompositeEventPublisher();
        compositeEventPublisher.add(publisher1);
        compositeEventPublisher.add(publisher2);

        compositeEventPublisher.publish();
    }
}
