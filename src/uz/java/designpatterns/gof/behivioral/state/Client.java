package uz.java.designpatterns.gof.behivioral.state;

// Client code
public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        vendingMachine.setState(new HasCoinState());
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
    }
}