package FactoryPattern.pizza;

import java.util.ArrayList;

/**
 * @author KW
 */
public abstract class AbstractPizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + name);
        System.out.println("Adding sauce... " + name);
        System.out.println("Adding toppings... " + name);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }
    public void bake(){
        System.out.println("Bake for 25 minutes at 300");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
