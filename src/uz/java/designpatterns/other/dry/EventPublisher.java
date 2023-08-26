package uz.java.designpatterns.other.dry;

public class EventPublisher {

    public void publish(String event, Object data) {
        String topic = "destination";
        if (event.isBlank()) {
            return;
        }
        String resul = topic.concat(data.toString());
    }

    public void publishOn(String event, Object data) {
        String topic = "destination";
        if (event.isBlank()) {
            return;
        }
        String resul = topic.concat(data.toString());
    }
    public void publishOnWhen(String event, Object data) {
        String topic = "destination";
        if (event.isBlank()) {
            return;
        }
        String resul = topic.concat(data.toString());
    }

}
