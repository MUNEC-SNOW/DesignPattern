package DecoratorPattern.Beverage;

import DecoratorPattern.Beverage.AbstractBeverage;

public class HouseBlend extends AbstractBeverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public int cost() {
        return 89;
    }
}
