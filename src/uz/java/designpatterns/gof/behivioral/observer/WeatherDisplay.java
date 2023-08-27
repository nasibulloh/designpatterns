package uz.java.designpatterns.gof.behivioral.observer;

class WeatherDisplay implements Observer {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Current temperature: " + temperature + " degrees Celsius");
    }
}