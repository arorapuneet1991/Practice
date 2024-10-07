package interview.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements ParentBox {
    int price;
    List<ParentBox> subBoxList;

    public Box(int price) {
        this.price = price;
        this.subBoxList = new ArrayList<>();
    }

    public void addProduct(ParentBox box) {
        subBoxList.add(box);
    }

    public void removeProduct(ParentBox box) {
        subBoxList.remove(box);

    }

    @Override
    public int getPrice() {
        for (ParentBox box : subBoxList)
            this.price = this.price + box.getPrice();
        return this.price;
    }
}
