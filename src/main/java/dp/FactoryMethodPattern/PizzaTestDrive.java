package dp.FactoryMethodPattern;

public class PizzaTestDrive {

    public static void main(String[] args) {

       MyHWInfo myHWInfo = new MyHWInfo();
       myHWInfo.printInfo();

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }

}