package interview.designPatterns.creational.factorymethod.product;

public class ApplePhone implements MobilePhone {
    @Override
    public void display() {
        System.out.println("I am Apple Phone");
    }
}
