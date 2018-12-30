package decorator.head_first.bevereges;

public abstract class Beverege {
    String discription = "unknown Beverege";

    public String getDiscription() {
        return discription;
    }

    public abstract double cost();
}
