package singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null)return new Singleton();
        return uniqueInstance;
    }
}
