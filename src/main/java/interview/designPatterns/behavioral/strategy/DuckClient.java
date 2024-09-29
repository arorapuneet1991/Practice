package interview.designPatterns.behavioral.strategy;

public class DuckClient {
    public static void main(String[] args) {

        IQuackBehavior quackBehavior = new QuackingLoudBehavior();
        IFlyBehavior flyBehavior = new FlyingInAirBehavior();
        IDisplayBehavior displayBehavior = new DisplayingOnBodyBehavior();

        Duck strangeDuck = new Duck(flyBehavior, displayBehavior, quackBehavior);
        strangeDuck.quack();
        strangeDuck.fly();
        strangeDuck.display();

    }
}