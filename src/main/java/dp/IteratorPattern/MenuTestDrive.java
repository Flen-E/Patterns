package dp.IteratorPattern;

public class MenuTestDrive {
    public static void main(String args[]) {
        MyHWInfo myHWInfo = new MyHWInfo();
        myHWInfo.printInfo();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,  dinnerMenu);
// With iterators
        System.out.println("[All Menu]");
        waitress.printMenu();
        System.out.println("[Vegetarian Menu]");
        waitress.printVegetarianMenu();
    }
}