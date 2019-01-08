package structural.decorator.head_first.bevereges;

public class Espresso extends Beverege {

    public Espresso() {
        discription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
