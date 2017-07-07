package observer;

public class ForecastsObserver implements Observer, Display{

    float temperature;
    float humidity;
    private Subject weatherData;


    public ForecastsObserver(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public float calculateHeat(){
        return temperature*2/humidity;
    }

    public void display() {
        System.out.println("Temperature tomorrow is " + temperature + " and humidity " + humidity + ". The heat will be " + calculateHeat());
    }


}
