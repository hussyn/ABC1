package Singletondesignpattern;

public class SingletonDesignPatternExample {
    private static SingletonDesignPatternExample singletonInstance;

    private SingletonDesignPatternExample() {

    }

    private static synchronized SingletonDesignPatternExample getInstance() {
            /* Checking whether the instance reference */
            if (singletonInstance == null) {
                    /* Creating new Instance if no reference occurs */
                    singletonInstance = new SingletonDesignPatternExample();
            }
            return singletonInstance;
    }

    public static void main(String[] args) {
            System.out.println("Objerve the Output\n");
            SingletonDesignPatternExample instance1 = new SingletonDesignPatternExample();
            System.out.println("Instance1:- " + instance1.getInstance());
            SingletonDesignPatternExample instance2 = new SingletonDesignPatternExample();
            System.out.println("Instance2:- " + instance2.getInstance());
    }
}