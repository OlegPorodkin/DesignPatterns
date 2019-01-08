package structural.decorator.head_first.bevereges;

public class Decaf extends Beverege {
    public Decaf() {
        discription = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
