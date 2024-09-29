package interview.designPatterns.creational.factorymethod.product;

public class AndroidPhone implements MobilePhone {

    @Override
    public void display() {
        System.out.println("I am Android Phone");
    }
}
