package dp.AbstractFactoryPattern;

public class ClamsPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamsPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();

    }
}
