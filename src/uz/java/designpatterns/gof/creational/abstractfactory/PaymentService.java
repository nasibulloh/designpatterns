package uz.java.designpatterns.gof.creational.abstractfactory;

import java.math.BigDecimal;

public interface PaymentService {
    void pay(String account, BigDecimal amount);
}
