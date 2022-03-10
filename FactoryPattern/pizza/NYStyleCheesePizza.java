package FactoryPattern.pizza;

/**
 * @author KW
 */
public class NYStyleCheesePizza extends AbstractPizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
