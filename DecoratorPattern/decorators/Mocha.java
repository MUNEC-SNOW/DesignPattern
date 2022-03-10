package DecoratorPattern.decorators;

import DecoratorPattern.Beverage.AbstractBeverage;

/**
 * @author KW
 */
public class Mocha extends CondimentDecorator{
    AbstractBeverage abstractBeverage;

    public Mocha(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }
    /**
     * cost add mocha
     * @return int price
     */
    @Override
    public int cost() {
        return 20 + abstractBeverage.cost();
    }

    /**
     * description add mocha
     * @return String description
     */
    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Mocha";
    }
}
