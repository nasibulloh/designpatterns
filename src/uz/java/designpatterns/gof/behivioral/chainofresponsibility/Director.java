package uz.java.designpatterns.gof.behivioral.chainofresponsibility;

class Director implements PurchaseHandler {
    private PurchaseHandler nextHandler;

    @Override
    public void setNextHandler(PurchaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void approve(int amount) {
        if (amount <= 5000) {
            System.out.println("Director approved the purchase of $" + amount);
        } else if (nextHandler != null) {
            nextHandler.approve(amount);
        }
    }
}