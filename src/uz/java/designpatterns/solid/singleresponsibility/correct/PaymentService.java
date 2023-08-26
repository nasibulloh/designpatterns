package uz.java.designpatterns.solid.singleresponsibility.correct;

import java.math.BigDecimal;
import java.util.Random;

public class PaymentService {
    private final SmsService smsService;
    public PaymentService(SmsService smsService) {
        this.smsService = smsService;
    }

    public void pay(String account, BigDecimal amount) {
        String phone = ""; // Extract phone number by account
        smsService.send(phone, String.valueOf(new Random().nextInt()));
    }
}
