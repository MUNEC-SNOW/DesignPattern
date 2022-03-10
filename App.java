import DecoratorPattern.StarBuzzCoffee;
import ObserverPattern.WeatherStation;
import StrategyPattern.MiniDuck;

/**
 * @author KW
 */
public class App {
    public static void main(String[] args) {
        MiniDuck testStgPtn = new MiniDuck();
        WeatherStation testObsPtn = new WeatherStation();
        StarBuzzCoffee test = new StarBuzzCoffee();
        testStgPtn.testStrategyPattern();
        testObsPtn.testObserverPattern();
        test.decoratorTestFunction();
    }
}
