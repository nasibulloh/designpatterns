package uz.java.designpatterns.gof.behivioral.strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "12/24");
        PaymentStrategy paypalPayment = new PayPalPayment("example@example.com");

        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(50.0);
    }
}