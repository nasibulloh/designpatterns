package uz.java.designpatterns.gof.structural.facade;

// Facade class
class BankingServiceFacade {
    private Account account;
    private SecuritySystem securitySystem;

    public BankingServiceFacade(String username, String password, int initialBalance) {
        securitySystem = new SecuritySystem();
        if (securitySystem.verifyUser(username, password)) {
            account = new Account(initialBalance);
        } else {
            System.out.println("User verification failed.");
        }
    }

    public void debit(int amount) {
        account.debit(amount);
    }

    public void credit(int amount) {
        account.credit(amount);
    }
}