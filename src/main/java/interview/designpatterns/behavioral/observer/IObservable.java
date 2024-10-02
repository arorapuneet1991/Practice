package interview.designpatterns.behavioral.observer;

public interface IObservable {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyy();
}
