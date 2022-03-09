package ObserverPattern.observer;

import ObserverPattern.subject.DisplayElement;
import ObserverPattern.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author KW
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float lastTemperature = 75f;
    private float temperature;

    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Weather forecast: last temp is " + lastTemperature
                + "F degrees and current is: " + temperature + "F degrees.");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperature();
        }
        display();
        this.lastTemperature = this.temperature;
    }
}
