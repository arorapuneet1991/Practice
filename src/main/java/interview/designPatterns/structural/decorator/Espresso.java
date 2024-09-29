package interview.designPatterns.structural.decorator;

public class Espresso extends Beverage {

    // this is the base cost
    // can exist independently
    // unlike decorator cost which only exists on top of this kind of cose
    public int cost() {
        return 1;
    }
}
