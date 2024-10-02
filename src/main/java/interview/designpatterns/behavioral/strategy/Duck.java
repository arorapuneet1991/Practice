package interview.designpatterns.behavioral.strategy;

// behavior shared downward is ok, but sideways is problematic
//because the behavior sharing might not be the same in all classes, it could be mix-match

// strategy pattern helps you choose algorithm without depending on the class using it
// instead of subclasses, the behaviors now are actually configurations of clubbed configurations


// shows a better way than inheritance and class explosion
public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;

    public Duck(IFlyBehavior fly, IDisplayBehavior display, IQuackBehavior quack) {
        this.displayBehavior = display;
        this.flyBehavior = fly;
        this.quackBehavior = quack;
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public void display() {
        this.displayBehavior.display();
    }

    public void fly() {
        this.flyBehavior.fly();
    }
}
