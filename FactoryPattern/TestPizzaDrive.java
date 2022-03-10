package FactoryPattern;

import FactoryPattern.factory.AbstractPizzaStore;
import FactoryPattern.factory.ChicagoPizzaStore;
import FactoryPattern.factory.NYPizzaStore;
import FactoryPattern.pizza.AbstractPizza;

public class TestPizzaDrive {
    public void testFactory(){
        AbstractPizzaStore nyStore = new NYPizzaStore();
        AbstractPizzaStore chicagoStore = new ChicagoPizzaStore();

        AbstractPizza pizza = nyStore.orderPizza("cheese");
        System.out.println("KKW orded a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("LXH orded a " + pizza.getName() + "\n");
    }
}
