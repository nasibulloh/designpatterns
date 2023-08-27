package uz.java.designpatterns.gof.creational.singleton;

class SingletonEager {
    private final static SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
