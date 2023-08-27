package uz.java.designpatterns.gof.behivioral.strategy;

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double totalAmount) {
        paymentStrategy.pay(totalAmount);
    }
}
