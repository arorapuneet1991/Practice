package interview.designpatterns.behavioral.strategy;

public class QuackingLoudBehavior implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("I quack loudly");
    }
}
