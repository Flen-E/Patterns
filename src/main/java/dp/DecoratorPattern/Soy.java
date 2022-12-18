package dp.DecoratorPattern;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;

    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
