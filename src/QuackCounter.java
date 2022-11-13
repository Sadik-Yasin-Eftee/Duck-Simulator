public class QuackCounter implements Quackable{
    Quackable duck;
    static int counter;

    public QuackCounter (Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        counter++;
    }

    public static int getNumberOfQuacks(){
        return counter;
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        duck.addObserver(observer);
    }
    public String toString() {
        return duck.toString();
    }
}
