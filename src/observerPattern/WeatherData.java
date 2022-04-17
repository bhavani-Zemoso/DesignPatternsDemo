package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();
    double temperature, humidity, pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index != -1)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(temperature, humidity, pressure);

    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
