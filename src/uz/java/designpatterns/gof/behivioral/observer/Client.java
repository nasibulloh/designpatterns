package uz.java.designpatterns.gof.behivioral.observer;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStationImpl();
        Observer weatherDisplay = new WeatherDisplay();

        weatherStation.addObserver(weatherDisplay);

        weatherStation.setTemperature(25); // Temperature changes
        weatherStation.setTemperature(30);
    }
}