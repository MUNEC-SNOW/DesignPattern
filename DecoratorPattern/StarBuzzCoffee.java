package DecoratorPattern;

import DecoratorPattern.Beverage.AbstractBeverage;
import DecoratorPattern.Beverage.DarkRoast;
import DecoratorPattern.Beverage.Espresso;
import DecoratorPattern.Beverage.HouseBlend;
import DecoratorPattern.decorators.Mocha;
import DecoratorPattern.decorators.Soy;
import DecoratorPattern.decorators.Whip;

/**
 * @author Administrator
 */
public class StarBuzzCoffee {
    public void decoratorTestFunction(){
        AbstractBeverage abstractBeverage = new Espresso();
        AbstractBeverage abstractBeverage1 = new DarkRoast();
        AbstractBeverage abstractBeverage2 = new HouseBlend();

        abstractBeverage1 = new Mocha(abstractBeverage1);
        abstractBeverage1 = new Mocha(abstractBeverage1);
        abstractBeverage1 = new Whip(abstractBeverage1);

        abstractBeverage2 = new Soy(abstractBeverage2);
        abstractBeverage2 = new Mocha(abstractBeverage2);
        abstractBeverage2 = new Whip(abstractBeverage2);

        showDes(abstractBeverage);
        showDes(abstractBeverage1);
        showDes(abstractBeverage2);
    }

    public void showDes(AbstractBeverage abstractBeverage){
        System.out.println(abstractBeverage.getDescription()
                + "$" + ((double)abstractBeverage.cost()/100));
    }

}
