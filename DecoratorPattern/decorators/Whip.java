package DecoratorPattern.decorators;

import DecoratorPattern.Beverage.AbstractBeverage;

/**
 * @author KW
 */
public class Whip extends CondimentDecorator{
    AbstractBeverage abstractBeverage;

    public Whip(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }
    /**
     * every decorator need to complete this function
     * @return int price
     */
    @Override
    public int cost() {
        return 10 + abstractBeverage.cost();
    }

    /**
     * every decorator need to complete this function
     * @return String description
     */
    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", whip";
    }
}
