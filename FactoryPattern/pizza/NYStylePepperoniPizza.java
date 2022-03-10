package FactoryPattern.pizza;

public class NYStylePepperoniPizza extends AbstractPizza{
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Pepperoni");
    }
}