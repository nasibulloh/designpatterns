package uz.java.designpatterns.gof.creational.prototype;

import java.util.Objects;

record OrderService(long accountId, long accountNumber) implements Cloneable {

    @Override
    public OrderService clone() throws CloneNotSupportedException {
        return (OrderService) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderService service = (OrderService) o;
        return accountId == service.accountId && accountNumber == service.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountNumber);
    }
}
