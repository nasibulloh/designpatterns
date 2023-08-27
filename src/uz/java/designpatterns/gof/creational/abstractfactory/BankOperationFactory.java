package uz.java.designpatterns.gof.creational.abstractfactory;

class BankOperationFactory {

    public CardService getCardService(BankOperationType type) {
        CardService service;
        switch (type) {
            case VISA_CARD -> service = new VisaCardService();
            case MASTER_CARD -> service = new MasterCardService();
            default -> throw new IllegalArgumentException("No implementation found.");
        }
        return service;
    }

    public PaymentService getPaymentService(BankOperationType type) {
        PaymentService service;
        switch (type) {
            case PAY -> service = new ProvidersPaymentService();
            case P2P -> service = new ExternalPaymentService();
            default -> throw new IllegalArgumentException("No implementation found.");
        }
        return service;
    }
}
