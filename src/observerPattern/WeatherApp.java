package observerPattern;

public class WeatherApp {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
        WeatherStatsDisplay weatherStatsDisplay = new WeatherStatsDisplay(weatherData);

        weatherData.setMeasurements(34.5, 45, 23);
        weatherData.setMeasurements(36.78, 56.787, 34);
    }
}
