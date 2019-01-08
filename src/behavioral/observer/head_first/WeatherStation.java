package behavioral.observer.head_first;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 45, 30.4f);
        weatherData.setMeasurements(82, 70, 29.3f);
        weatherData.setMeasurements(78, 90, 35.6f);
    }
}
