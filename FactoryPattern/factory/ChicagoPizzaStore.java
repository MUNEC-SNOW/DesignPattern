package FactoryPattern.factory;

import FactoryPattern.constant.Constant;
import FactoryPattern.pizza.*;

public class ChicagoPizzaStore extends AbstractPizzaStore{
    Constant c = new Constant();
    @Override
    protected AbstractPizza createPizza(String item) {
        if (c.CHEESE.equals(item)){
            return new ChicagoStyleCheesePizza();
        } else if (c.VEGGIE.equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if (c.CLAM.equals(item)) {
            return new ChicagoStyleClamPizza();
        } else if (c.PEPPERONI.equals(item)){
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
