package DecoratorPattern.Beverage;

import DecoratorPattern.Beverage.AbstractBeverage;

/**
 * @author KW
 */
public class Espresso extends AbstractBeverage {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public int cost() {
        return 199;
    }
}
