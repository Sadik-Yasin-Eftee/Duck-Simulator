import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject implements QuackObservable {
    List<Observer>observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Subject(QuackObservable duck){
        this.duck = duck;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
    public Iterator<Observer> getObservers() {
        return observers.iterator();
    }
}
