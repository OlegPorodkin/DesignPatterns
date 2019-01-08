package behavioral.strategy.head_first.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
