package DecoratorPattern.Beverage;

/**
 * @author KW
 */
public abstract class AbstractBeverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    /**
     * every decorator need to complete this function
     * @return int price
     */
    public abstract int cost();
}
