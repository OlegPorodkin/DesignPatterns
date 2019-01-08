package structural.decorator.head_first.bevereges;

public class DarkRoast extends Beverege {

    public DarkRoast() {
        discription = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
