package interview.designpatterns.creational.abstractfactory.product.os;

public class AndroidOS implements IOperatingSystem{
    @Override
    public void displayOS() {
        System.out.println("I am Android OS");
    }
}
