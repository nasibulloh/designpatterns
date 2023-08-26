package uz.java.designpatterns.solid.interfacesegregation.incorrect;

import java.math.BigDecimal;

public interface BillingService {
    void checkBalance(String account);

    void pay(String account, BigDecimal amount);

    void debit(String account, BigDecimal amount) throws IllegalAccessException;

    void credit(String account, BigDecimal amount) throws IllegalAccessException;

    void blockCard(String carNumber) throws IllegalAccessException;

    void unblockCard(String carNumber) throws IllegalAccessException;

}
