import DecoratorPattern.StarBuzzCoffee;
import FactoryPattern.TestPizzaDrive;
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
        TestPizzaDrive testFactPtn = new TestPizzaDrive();
        testStgPtn.testStrategyPattern();
        testObsPtn.testObserverPattern();
        test.decoratorTestFunction();
        testFactPtn.testFactory();
    }
}
