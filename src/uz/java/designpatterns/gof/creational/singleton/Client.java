package uz.java.designpatterns.gof.creational.singleton;

class Client {
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1 == singletonEager2);


        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        System.out.println(singletonLazy1 == singletonLazy2);

        SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSynchronized2 = SingletonSynchronized.getInstance();

        System.out.println(singletonSynchronized1 == singletonSynchronized2);

        SingletonDoubleChecked singletonDoubleChecked1 = SingletonDoubleChecked.getInstance();
        SingletonDoubleChecked singletonDoubleChecked2 = SingletonDoubleChecked.getInstance();

        System.out.println(singletonDoubleChecked1 == singletonDoubleChecked2);

        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

        System.out.println(singletonEnum1 == singletonEnum2);

    }
}
