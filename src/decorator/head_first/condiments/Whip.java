package decorator.head_first.condiments;

import decorator.head_first.bevereges.Beverege;

public class Whip extends CondimentDecorator {
    private Beverege beverege;

    public Whip(Beverege beverege) {
        this.beverege = beverege;
    }

    @Override
    public String getDiscription() {
        return beverege.getDiscription() + ", whip";
    }

    @Override
    public double cost() {
        return .10 + beverege.cost();
    }
}
