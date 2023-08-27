package uz.java.designpatterns.gof.structural.facade;

class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void debit(int amount) {
        balance -= amount;
        System.out.println("Debited $" + amount + ". Balance: $" + balance);
    }

    public void credit(int amount) {
        balance += amount;
        System.out.println("Credited $" + amount + ". Balance: $" + balance);
    }
}
