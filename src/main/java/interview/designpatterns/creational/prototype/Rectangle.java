package interview.designpatterns.creational.prototype;

public class Rectangle extends Shape {
    public int length;
    public int width;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        this.length = target.length;
        this.width = target.length;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
