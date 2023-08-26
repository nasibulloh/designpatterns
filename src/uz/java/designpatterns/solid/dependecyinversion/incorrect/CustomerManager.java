package uz.java.designpatterns.solid.dependecyinversion.incorrect;

import uz.java.designpatterns.solid.dependecyinversion.incorrect.impl.GeneralCustomerService;

public class CustomerManager {
    private final GeneralCustomerService service;

    public CustomerManager(GeneralCustomerService service) {
        this.service = service;
    }
}
