package interview.designpatterns.structural.bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void displayShape() {
        System.out.println("I am a circle");
    }

    @Override
    public void displayShapeWithColor() {
        System.out.println("i am "+this.color.displayColor());
    }
}
