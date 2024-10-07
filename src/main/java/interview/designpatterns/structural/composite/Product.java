package interview.designpatterns.structural.composite;

public class Product implements ParentBox {
    int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
