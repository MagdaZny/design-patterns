package observerJavaBuiltIn;

import java.util.Observable;


public class WeatherData extends Observable {

    private float temperature;
    private float humidity;


    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity){

        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

}
