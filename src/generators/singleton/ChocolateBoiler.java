package generators.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiler;

    private static volatile ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiler = false;
    }

    public synchronized ChocolateBoiler getUniqueInstance() {
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null)uniqueInstance = new ChocolateBoiler();
            }
        }
        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiler = false;
        }
    }

    public void draine(){
        if (!isEmpty() && isBoiler()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiler()){
            boiler = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiler() {
        return boiler;
    }
}
