package FactoryPattern.pizza;

public class ChicagoStyleVeggiePizza extends AbstractPizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella Veggie");
    }
}