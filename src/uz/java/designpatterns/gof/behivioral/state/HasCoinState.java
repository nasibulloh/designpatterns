package uz.java.designpatterns.gof.behivioral.state;

class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing the selected item.");
    }
}
