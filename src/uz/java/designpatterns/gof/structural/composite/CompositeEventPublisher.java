package uz.java.designpatterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

class CompositeEventPublisher implements EventPublisher {

    private final List<EventPublisher> publishers = new ArrayList<>();

    public void add(EventPublisher publisher) {
        publishers.add(publisher);
    }

    public void remove(EventPublisher publisher) {
        publishers.remove(publisher);
    }

    @Override
    public void publish() {
        for (EventPublisher publisher : publishers) {
            publisher.publish();
        }
    }
}
