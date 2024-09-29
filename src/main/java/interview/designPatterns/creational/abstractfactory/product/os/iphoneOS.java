package interview.designPatterns.creational.abstractfactory.product.os;

public class iphoneOS implements IOperatingSystem{

    @Override
    public void displayOS() {
        System.out.println("I am iphone OS");
    }
}
