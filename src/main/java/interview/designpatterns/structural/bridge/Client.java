package interview.designpatterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Circle circle=new Circle(new Red());
        circle.displayShapeWithColor();
    }
}
