package FactoryPattern.pizza;

public class ChicagoStyleClamPizza extends AbstractPizza{
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Sauce and Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Clam");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
