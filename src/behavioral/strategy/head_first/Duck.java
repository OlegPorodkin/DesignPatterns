package behavioral.strategy.head_first;

import behavioral.strategy.head_first.fly.FlyBehavior;
import behavioral.strategy.head_first.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void  performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("All duck float, even decoys!!!");
    }
}
