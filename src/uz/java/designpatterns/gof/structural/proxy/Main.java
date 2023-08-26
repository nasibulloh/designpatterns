package uz.java.designpatterns.gof.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Connection connection = new ProxyConnection(true);
        connection.connect();
    }
}
