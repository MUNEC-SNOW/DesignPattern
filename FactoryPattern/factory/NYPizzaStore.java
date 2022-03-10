package FactoryPattern.factory;

import FactoryPattern.pizza.*;
import FactoryPattern.constant.Constant;

public class NYPizzaStore extends AbstractPizzaStore{
    Constant c = new Constant();
    @Override
    protected AbstractPizza createPizza(String item) {
        if (c.CHEESE.equals(item)){
            return new NYStyleCheesePizza();
        } else if (c.VEGGIE.equals(item)) {
            return new NYStyleVeggiePizza();
        } else if (c.CLAM.equals(item)) {
            return new NYStyleClamPizza();
        } else if (c.PEPPERONI.equals(item)){
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
