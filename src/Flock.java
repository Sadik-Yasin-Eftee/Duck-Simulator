import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
    List<Quackable>ducks = new ArrayList<Quackable>();
    public void addDuck(Quackable duck){
        ducks.add(duck);
    }
    @Override
    public void quack() {
        Iterator<Quackable>iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }
    }
    public void addObserver(Observer observer){
        Iterator<Quackable>iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.addObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

}
