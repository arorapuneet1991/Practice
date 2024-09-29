package interview.designPatterns.creational.abstractfactory.product.phone;

public class AndroidPhone implements MobilePhone {

    @Override
    public void display() {
        System.out.println("I am Android Phone");
    }
}
