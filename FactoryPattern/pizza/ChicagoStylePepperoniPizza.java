package FactoryPattern.pizza;

public class ChicagoStylePepperoniPizza extends AbstractPizza{
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Sauce and Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}