package dp.DecoratorPattern;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public double cost() {
        return .30 + beverage.cost();
    }
}
