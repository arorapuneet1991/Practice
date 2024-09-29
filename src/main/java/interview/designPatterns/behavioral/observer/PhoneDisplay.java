package interview.designPatterns.behavioral.observer;

public class PhoneDisplay implements IObserver {
    // this variable is very important
    // because whenever the update on temperature comes in,
    // this observer needs to get it by using the getTemperature method on this variable
    // like in update method
    WeatherStation station;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.station = weatherStation;
    }

    @Override
    public void update() {
        this.station.getTemperature();
    }
}
