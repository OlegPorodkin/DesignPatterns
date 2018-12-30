package strategy.head_first;

import strategy.head_first.fly.FlyNoWay;
import strategy.head_first.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i`m a model duck");
    }
}
