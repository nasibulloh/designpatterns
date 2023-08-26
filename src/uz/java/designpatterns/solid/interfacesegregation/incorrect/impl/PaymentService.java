package uz.java.designpatterns.solid.interfacesegregation.incorrect.impl;

import uz.java.designpatterns.solid.interfacesegregation.incorrect.BillingService;

import java.math.BigDecimal;

public class PaymentService implements BillingService {
    @Override
    public void checkBalance(String account) {
        // TODO: 8/19/23 Do logic
    }

    @Override
    public void pay(String account, BigDecimal amount) {
        // TODO: 8/19/23 Do logic
    }

    @Override
    public void debit(String account, BigDecimal amount) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public void credit(String account, BigDecimal amount) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public void blockCard(String carNumber) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public void unblockCard(String carNumber) throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
