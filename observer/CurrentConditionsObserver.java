package observer;

public class CurrentConditionsObserver implements Display, Observer{


    float temperature;
    float humidity;
    private Subject weatherData;


    public CurrentConditionsObserver(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Temperature today is " + temperature + " and humidity " + humidity + ".");
    }

}
