package observer;

import java.util.ArrayList;


public class WeatherData implements Subject{

    private ArrayList observers;
    private float temperature;
    private float humidity;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void nofifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity);
        }

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    public void measurementsChanged(){
        nofifyObservers();
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
