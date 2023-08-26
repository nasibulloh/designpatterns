package uz.java.designpatterns.solid.interfacesegregation.correct;

import java.math.BigDecimal;

public interface PaymentService {
    void checkBalance(String account);

    void pay(String account, BigDecimal amount);
}
