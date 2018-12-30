package decorator.head_first.bevereges;

public class HouseBlend extends Beverege {
    public HouseBlend() {
        discription = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
