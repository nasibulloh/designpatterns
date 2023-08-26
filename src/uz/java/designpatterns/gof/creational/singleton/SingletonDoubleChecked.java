package uz.java.designpatterns.gof.creational.singleton;

public class SingletonDoubleChecked {

    private static SingletonDoubleChecked INSTANCE;

    private SingletonDoubleChecked() {
    }

    public static synchronized SingletonDoubleChecked getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleChecked();
                }
            }
        }
        return INSTANCE;
    }
}
