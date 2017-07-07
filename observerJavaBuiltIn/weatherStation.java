package observerJavaBuiltIn;

public class weatherStation {

    public static void main(String args[]){

        WeatherData weatherData = new WeatherData();
        Display currentConditions = new CurrentConditionsObserver(weatherData);

        weatherData.setMeasurements(20, 35);
        weatherData.setMeasurements(10, 58.5f);
        weatherData.setMeasurements(50, 3);

    }

}
