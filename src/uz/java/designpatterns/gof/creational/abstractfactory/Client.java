package uz.java.designpatterns.gof.creational.abstractfactory;

import java.math.BigDecimal;

class Client {
    public static void main(String[] args) {
        BankOperationFactory factory = new BankOperationFactory();
        PaymentService paymentService = factory.getPaymentService(BankOperationType.PAY);
        paymentService.pay("1000", BigDecimal.valueOf(3430));

        PaymentService p2pService = factory.getPaymentService(BankOperationType.P2P);
        p2pService.pay("1000", BigDecimal.valueOf(3430));

        CardService visaCardService = factory.getCardService(BankOperationType.VISA_CARD);
        visaCardService.addCard("90392****1923", "12/23");

        CardService masterCardService = factory.getCardService(BankOperationType.MASTER_CARD);
        masterCardService.addCard("90392****1923", "12/23");

    }
}
