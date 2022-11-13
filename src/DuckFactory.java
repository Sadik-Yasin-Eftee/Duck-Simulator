public class DuckFactory extends AbstractFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createReadheadDuck() {
        return new ReadheadDuck();
    }
}
