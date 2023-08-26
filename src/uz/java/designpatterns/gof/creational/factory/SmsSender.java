package uz.java.designpatterns.gof.creational.factory;

public class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        // TODO: 8/26/23 send sms config
    }

    @Override
    public boolean accept(Type type) {
        return Type.SMS ==type;
    }
}
