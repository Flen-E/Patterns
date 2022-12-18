package dp.StrategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();
        Duck model = new ModelDuck();

        mallard.performQuack();
        rubber.performQuack();
        decoy.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }
}
