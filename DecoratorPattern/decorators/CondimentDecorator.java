package DecoratorPattern.decorators;

import DecoratorPattern.Beverage.AbstractBeverage;

/**
 * @author KW
 */
public abstract class CondimentDecorator extends AbstractBeverage {
    /**
     * every decorator need to complete this function
     * @return String description
     */
    @Override
    public abstract String getDescription();
}
