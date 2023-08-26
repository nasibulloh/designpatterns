package uz.java.designpatterns.solid.interfacesegregation.correct.impl;

import uz.java.designpatterns.solid.interfacesegregation.correct.BankService;
import uz.java.designpatterns.solid.interfacesegregation.correct.PaymentService;

import java.math.BigDecimal;

public class MoneyOperationService implements BankService, PaymentService {
    @Override
    public void debit(String account, BigDecimal amount) {
        // TODO: 8/19/23 Write logic here
    }

    @Override
    public void credit(String account, BigDecimal amount) {
        // TODO: 8/19/23 Write logic here
    }

    @Override
    public void checkBalance(String account) {
        // TODO: 8/19/23 Write logic here
    }

    @Override
    public void pay(String account, BigDecimal amount) {
        // TODO: 8/19/23 Write logic here
    }
}
