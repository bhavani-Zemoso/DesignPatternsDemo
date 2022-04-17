package observerPattern;

public class CurrentWeatherDisplay implements Observer, Display{

    WeatherData weatherData;
    double temperature, humidity, pressure;

    public CurrentWeatherDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {

        System.out.println("Current Weather Display");
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println();

    }
}
