package uz.java.designpatterns.gof.creational.prototype;

public record OrderService(long accountId, long accountNumber) implements Cloneable {

    @Override
    public OrderService clone() throws CloneNotSupportedException {
        return (OrderService) super.clone();
    }
}
