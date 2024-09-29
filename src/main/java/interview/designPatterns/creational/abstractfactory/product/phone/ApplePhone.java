package interview.designPatterns.creational.abstractfactory.product.phone;

public class ApplePhone implements MobilePhone {
    @Override
    public void display() {
        System.out.println("I am Apple Phone");
    }
}
