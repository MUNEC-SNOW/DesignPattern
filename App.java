import DecoratorPattern.StarBuzzCoffee;
import FactoryPattern.TestPizzaDrive;
import ObserverPattern.WeatherStation;
import SingletonPattern.DoubleCheckLockSingleton;
import StrategyPattern.MiniDuck;

/**
 * @author KW
 */
public class App {
    public static void main(String[] args) {
        MiniDuck testStgPtn = new MiniDuck();
        WeatherStation testObsPtn = new WeatherStation();
        StarBuzzCoffee testDecoPtn = new StarBuzzCoffee();
        TestPizzaDrive testFactPtn = new TestPizzaDrive();
        DoubleCheckLockSingleton doubleCheckLockSingleton= DoubleCheckLockSingleton.getInstance();

        testStgPtn.testStrategyPattern();
        testObsPtn.testObserverPattern();
        testDecoPtn.decoratorTestFunction();
        testFactPtn.testFactory();
    }
}
