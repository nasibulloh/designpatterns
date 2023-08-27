package uz.java.designpatterns.gof.behivioral.state;

// Concrete States (Different vending machine states)
class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
    }

    @Override
    public void selectItem() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Insert a coin and select an item.");
    }
}
