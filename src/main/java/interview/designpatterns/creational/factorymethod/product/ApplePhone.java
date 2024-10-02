package interview.designpatterns.creational.factorymethod.product;

public class ApplePhone implements MobilePhone {
    @Override
    public void display() {
        System.out.println("I am Apple Phone");
    }
}
