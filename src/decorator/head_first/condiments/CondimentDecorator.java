package decorator.head_first.condiments;

import decorator.head_first.bevereges.Beverege;

public abstract class CondimentDecorator extends Beverege {
    @Override
    public abstract String getDiscription();
}
