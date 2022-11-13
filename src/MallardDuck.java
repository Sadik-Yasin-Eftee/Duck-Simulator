public class MallardDuck implements Quackable{
    Subject subject;
    public MallardDuck(){
        subject = new Subject(this);
    }
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
    public void addObserver(Observer observer){
        subject.addObserver(observer);
    }
    public void notifyObservers(){
        subject.notifyObservers();
    }
    public String toString() {
        return "Mallard Duck";
    }
}
