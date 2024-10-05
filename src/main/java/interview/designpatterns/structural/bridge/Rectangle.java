package interview.designpatterns.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void displayShape() {
        System.out.println("I am Rectangle");
    }

    public void displayShapeWithColor() {

    }


}
