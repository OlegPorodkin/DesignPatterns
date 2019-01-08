package behavioral.strategy.head_first;

import behavioral.strategy.head_first.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
