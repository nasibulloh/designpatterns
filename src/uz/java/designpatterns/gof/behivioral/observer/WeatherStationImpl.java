package uz.java.designpatterns.gof.behivioral.observer;

import java.util.ArrayList;
import java.util.List;

class WeatherStationImpl implements WeatherStation {
    private int temperature;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}