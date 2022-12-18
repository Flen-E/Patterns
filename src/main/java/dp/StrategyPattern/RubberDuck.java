package dp.StrategyPattern;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("I'm a Rubber Duck");
    }
}
