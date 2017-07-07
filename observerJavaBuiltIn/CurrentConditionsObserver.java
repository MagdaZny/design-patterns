package observerJavaBuiltIn;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserver implements Display, Observer {


    float temperature;
    float humidity;
    private Observable observable;


    public CurrentConditionsObserver(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {

        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Temperature today is " + temperature + " and humidity " + humidity + ".");
    }

}
