package dev.neyerdavid;

public class Singleton {
    private volatile static Singleton singleInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(singleInstance == null) {
            synchronized (Singleton.class) {
                if(singleInstance == null) {
                    singleInstance = new Singleton();
                }
            }
        }
        return singleInstance;
    }
}
