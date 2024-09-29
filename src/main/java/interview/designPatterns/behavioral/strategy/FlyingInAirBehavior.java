package interview.designPatterns.behavioral.strategy;

public class FlyingInAirBehavior implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("I fly in Air");
    }
}
