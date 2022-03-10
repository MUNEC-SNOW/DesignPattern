package FactoryPattern.factory;

import FactoryPattern.pizza.AbstractPizza;

/**
 * @author KW
 */
public abstract class AbstractPizzaStore {
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract AbstractPizza createPizza(String type);
}
