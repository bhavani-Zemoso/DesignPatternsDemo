package observerPattern;

public class WeatherStatsDisplay implements Observer, Display{

    WeatherData weatherData;
    double temperature, humidity, pressure;
    double avgTemperature, avgHumidity, avgPressure, sumTemperature, sumHumidity, sumPressure;
    int count = 0;

    public WeatherStatsDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Weather Stats Display");
        System.out.println("Average Temperature : " + avgTemperature);
        System.out.println("Average Humidity : " + avgHumidity);
        System.out.println("Average Pressure : " + avgPressure);
        System.out.println();
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        calculateAvg();
        display();

    }

    public void calculateAvg()
    {
        count++;
        sumTemperature += this.temperature;
        sumHumidity += this.humidity;
        sumPressure += this.pressure;

        avgTemperature = sumTemperature / count;
        avgHumidity = sumHumidity / count;
        avgPressure = sumPressure / count;

    }
}
