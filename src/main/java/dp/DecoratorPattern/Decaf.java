package dp.DecoratorPattern;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 3.99;
    }
}
