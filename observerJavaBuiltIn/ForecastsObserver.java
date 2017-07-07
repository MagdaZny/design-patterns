package observerJavaBuiltIn;

import java.util.Observable;
import java.util.Observer;

public class ForecastsObserver implements Observer, Display {

    float temperature;
    float humidity;
    private Observable observable;


    public ForecastsObserver(Observable observable){
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

    public float calculateHeat(){
        return temperature*2/humidity;
    }

    public void display() {
        System.out.println("Temperature tomorrow is " + temperature + " and humidity " + humidity + ". The heat will be " + calculateHeat());
    }


}
