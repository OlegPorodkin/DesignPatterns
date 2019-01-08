package structural.decorator.head_first.condiments;

import structural.decorator.head_first.bevereges.Beverege;

public class Soy extends CondimentDecorator {
    private Beverege beverege;

    public Soy(Beverege beverege) {
        this.beverege = beverege;
    }

    @Override
    public String getDiscription() {
        return beverege.getDiscription() + ", soy";
    }

    @Override
    public double cost() {
        return .15 + beverege.cost();
    }
}
