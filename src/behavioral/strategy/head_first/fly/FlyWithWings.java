package behavioral.strategy.head_first.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am fly!");
    }
}
