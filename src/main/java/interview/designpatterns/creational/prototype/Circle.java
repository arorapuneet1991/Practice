package interview.designpatterns.creational.prototype;

public class Circle extends Shape{

    public int radius;

    public Circle(Circle target){
        super(target);
        this.radius=target.radius;
    }

    public Circle() {

    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
