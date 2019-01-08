package behavioral.strategy.head_first;

import behavioral.strategy.head_first.fly.FlyWithWings;
import behavioral.strategy.head_first.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
