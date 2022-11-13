public class Main {
    public static void main(String[] args){
        Main simulator = new Main();
        AbstractFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractFactory duckFactory) {

        Quackable redheadDuck = duckFactory.createReadheadDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.addDuck(redheadDuck);
        flockOfDucks.addDuck(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.addDuck(mallardOne);
        flockOfMallards.addDuck(mallardTwo);
        flockOfMallards.addDuck(mallardThree);
        flockOfMallards.addDuck(mallardFour);

        flockOfDucks.addDuck(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.addObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " +
                QuackCounter.getNumberOfQuacks() +
                " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}