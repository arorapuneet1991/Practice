package interview.designpatterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        Product product1 = new Product(10);
        Product product2 = new Product(20);

        Box innerBox = new Box(1);
        Box outerBox = new Box(2);

        innerBox.addProduct(product1);
        innerBox.addProduct(product2);

        outerBox.addProduct(innerBox);

        System.out.println(outerBox.getPrice());
    }
}
