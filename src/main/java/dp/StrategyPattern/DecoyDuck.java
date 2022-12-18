package dp.StrategyPattern;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyRocketPowered();
    }
    public void display(){
        System.out.println("I'm a Decoy Duck");
    }
}