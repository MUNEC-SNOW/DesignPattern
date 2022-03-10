package FactoryPattern.pizza;

public class NYStyleClamPizza extends AbstractPizza{
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Clam");
    }
}
