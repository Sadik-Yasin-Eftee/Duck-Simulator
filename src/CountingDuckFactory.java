public class CountingDuckFactory extends AbstractFactory{
    @Override
    public Quackable createReadheadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
}
