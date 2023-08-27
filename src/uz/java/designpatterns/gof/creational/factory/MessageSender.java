package uz.java.designpatterns.gof.creational.factory;

interface MessageSender {

    void send(String message);

    boolean accept(Type type);
}
