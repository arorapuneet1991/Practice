package interview.designpatterns.structural.bridge;

public abstract class Shape {
    Color color = null;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void displayShape();

    abstract public void displayShapeWithColor();
}
