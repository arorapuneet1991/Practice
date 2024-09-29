package interview.designPatterns.behavioral.strategy;

public class DisplayingOnBodyBehavior implements IDisplayBehavior {

    @Override
    public void display() {
        System.out.println("Displayed on body");
    }
}
