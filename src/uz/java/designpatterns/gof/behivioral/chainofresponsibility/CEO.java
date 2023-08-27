package uz.java.designpatterns.gof.behivioral.chainofresponsibility;

class CEO implements PurchaseHandler {
    @Override
    public void setNextHandler(PurchaseHandler nextHandler) {
        // CEO is the last handler in the chain, so no next handler needed.
    }

    @Override
    public void approve(int amount) {
        System.out.println("CEO approved the purchase of $" + amount);
    }
}
