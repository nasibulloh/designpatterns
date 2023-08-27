package uz.java.designpatterns.gof.behivioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        PurchaseHandler manager = new Manager();
        PurchaseHandler director = new Director();
        PurchaseHandler ceo = new CEO();

        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        manager.approve(800);
        manager.approve(3000);
        manager.approve(10000);
    }
}