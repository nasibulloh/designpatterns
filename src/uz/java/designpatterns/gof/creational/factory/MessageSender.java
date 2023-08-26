package uz.java.designpatterns.gof.creational.factory;

public interface MessageSender {

    void send(String message);

    boolean accept(Type type);
}
