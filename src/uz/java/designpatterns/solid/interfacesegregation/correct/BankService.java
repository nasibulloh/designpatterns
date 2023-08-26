package uz.java.designpatterns.solid.interfacesegregation.correct;

import java.math.BigDecimal;

public interface BankService {
    void debit(String account, BigDecimal amount) throws IllegalAccessException;

    void credit(String account, BigDecimal amount) throws IllegalAccessException;
}
