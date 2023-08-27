package uz.java.designpatterns.gof.behivioral.command;

class Device {
    private final String name;

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " is turned on");
    }

    public void turnOff() {
        System.out.println(name + " is turned off");
    }
}