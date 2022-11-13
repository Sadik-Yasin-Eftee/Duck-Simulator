public class GooseAdapter implements Quackable{
    Subject subject;
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
        subject = new Subject(this);
    }
    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }
    public void addObserver(Observer observer){
        subject.addObserver(observer);
    }
    public void notifyObservers(){
        subject.notifyObservers();
    }
    public String toString() {
        return "Goose pretending to be a Duck";
    }
}
