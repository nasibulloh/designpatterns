package uz.java.designpatterns.gof.structural.facade;

public class Client {
    public static void main(String[] args) {
        BankingServiceFacade bankingService = new BankingServiceFacade("john_doe", "password123", 1000);
        bankingService.credit(500);
        bankingService.debit(300);
    }
}
