package uz.java.designpatterns.gof.behivioral.chainofresponsibility;

class Manager implements PurchaseHandler {
    private PurchaseHandler nextHandler;

    @Override
    public void setNextHandler(PurchaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("Manager approved the purchase of $" + amount);
        } else if (nextHandler != null) {
            nextHandler.approve(amount);
        }
    }
}