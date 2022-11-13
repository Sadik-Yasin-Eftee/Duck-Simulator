public interface QuackObservable {
    public void addObserver(Observer observer);
//    public void removeObserver(Observer observer);
    public void notifyObservers();
}
