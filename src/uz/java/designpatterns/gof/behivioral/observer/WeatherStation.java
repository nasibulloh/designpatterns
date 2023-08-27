package uz.java.designpatterns.gof.behivioral.observer;

interface WeatherStation {
    void setTemperature(int temperature);

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}