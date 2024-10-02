package interview.designpatterns.behavioral.observer;

import java.util.List;

public class WeatherStation implements IObservable {
    List<IObserver> observers;
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyy() {
        for (IObserver observer : this.observers) {
            observer.update();
        }
    }

}
