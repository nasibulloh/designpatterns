package uz.java.designpatterns.gof.behivioral.state;

// State interface
interface VendingMachineState {
    void insertCoin();
    void selectItem();
    void dispenseItem();
}
