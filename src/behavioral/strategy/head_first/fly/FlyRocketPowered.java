package behavioral.strategy.head_first.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying with a rocked!");
    }
}
