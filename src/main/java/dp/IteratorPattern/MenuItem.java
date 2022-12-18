package dp.IteratorPattern;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
    public MenuItem (String name, String description, boolean vegetarian,
                     double price ) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
// code here: setter to the fields.
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean getVegetarian(){
        return vegetarian;
    }


// set of getter methods to get access to the fields.
}
