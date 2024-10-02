package interview.designpatterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Circle circle=new Circle();

        circle.x=10;
        circle.y=20;
        circle.color="red";

        circle.radius=2;

        Circle cloned=(Circle) circle.clone();

        System.out.println(cloned.y);
        System.out.println(cloned.x);
        System.out.println(cloned.color);
        System.out.println(cloned.radius);

    }
}
