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
}
