package dp.DecoratorPattern;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double cost() {
        return 2.99;
    }
}
