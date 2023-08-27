package uz.java.designpatterns.gof.behivioral.strategy;

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}