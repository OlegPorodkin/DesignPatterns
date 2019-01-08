package structural.decorator.head_first.condiments;

import structural.decorator.head_first.bevereges.Beverege;

public class Moca extends CondimentDecorator {
    private Beverege beverege;

    public Moca(Beverege beverege) {
        this.beverege = beverege;
    }

    @Override
    public String getDiscription() {
        return beverege.getDiscription() + ", Moca";
    }

    @Override
    public double cost() {
        return .20 + beverege.cost();
    }
}
