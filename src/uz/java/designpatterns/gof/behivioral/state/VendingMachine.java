package uz.java.designpatterns.gof.behivioral.state;

// Context (Vending Machine)
class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }
}

