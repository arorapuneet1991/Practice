package interview.designpatterns.creational.abstractfactory.product.phone;

public class ApplePhone implements MobilePhone {
    @Override
    public void display() {
        System.out.println("I am Apple Phone");
    }
}
