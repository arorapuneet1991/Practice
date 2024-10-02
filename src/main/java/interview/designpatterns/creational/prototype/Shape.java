package interview.designpatterns.creational.prototype;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(Shape targetShape) {
        this.color = targetShape.color;
        this.x = targetShape.x;
        this.y = targetShape.y;
    }

    public Shape() {

    }

    public abstract Shape clone();
}
