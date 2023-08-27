package uz.java.designpatterns.gof.behivioral.chainofresponsibility;

interface PurchaseHandler {
    void setNextHandler(PurchaseHandler nextHandler);
    void approve(int amount);
}
