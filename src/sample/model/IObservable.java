package sample.model;

/*
    IObservable interface represents design pattern: OBSERVER
*/
public interface IObservable {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();
}
