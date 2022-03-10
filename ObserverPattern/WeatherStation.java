package ObserverPattern;

import ObserverPattern.observer.CurrentConditionsDisplay;
import ObserverPattern.observer.ForecastDisplay;
import ObserverPattern.subject.WeatherData;

/**
 * @author KW
 */
public class WeatherStation {
    public void testObserverPattern() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
