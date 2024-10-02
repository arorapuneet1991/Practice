package interview.designpatterns.structural.decorator;

public class CaramelDecorator extends AddOnDecorator {

    Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    // not a baseline cost
    // gets added to a base cost like espresso or decaf
    public int cost() {
        return this.beverage.cost() + 2;
    }
}
