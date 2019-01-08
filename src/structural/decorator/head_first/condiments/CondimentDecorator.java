package structural.decorator.head_first.condiments;

import structural.decorator.head_first.bevereges.Beverege;

public abstract class CondimentDecorator extends Beverege {
    @Override
    public abstract String getDiscription();
}
