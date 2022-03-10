package DecoratorPattern.Beverage;

/**
 * @author KW
 */
public class DarkRoast extends AbstractBeverage {
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public int cost() {
        return 99;
    }
}
