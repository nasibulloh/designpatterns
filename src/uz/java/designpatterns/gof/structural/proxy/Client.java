package uz.java.designpatterns.gof.structural.proxy;

class Client {
    public static void main(String[] args) {
        Connection connection = new ProxyConnection(true);
        connection.connect();
    }
}
