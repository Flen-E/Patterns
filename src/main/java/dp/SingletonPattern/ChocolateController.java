package dp.SingletonPattern;

public class ChocolateController {
    public static void main(String[] args) {
        MyHWInfo myHWInfo = new MyHWInfo();
        myHWInfo.printInfo();

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        boiler.fill();
        boiler2.reportBoilerState();
        boiler.boil();
        boiler2.reportBoilerState();
        boiler.drain();
        boiler2.reportBoilerState();

    }
}
