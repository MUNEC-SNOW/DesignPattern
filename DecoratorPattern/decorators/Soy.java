package DecoratorPattern.decorators;

import DecoratorPattern.Beverage.AbstractBeverage;

public class Soy extends CondimentDecorator{
    AbstractBeverage abstractBeverage;

    public Soy(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }
    /**
     * every decorator need to complete this function
     * @return int price
     */
    @Override
    public int cost() {
        return 15 + abstractBeverage.cost();
    }

    /**
     * every decorator need to complete this function
     * @return String description
     */
    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Soy";
    }
}
