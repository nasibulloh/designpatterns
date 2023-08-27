package uz.java.designpatterns.gof.creational.singleton;

class SingletonSynchronized {
    private static SingletonSynchronized INSTANCE;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSynchronized();
        }
        return INSTANCE;
    }
}
