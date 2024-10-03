package interview.designpatterns.structural.facade.subsystem.menu;

public class NonVegMenu implements Menus{
    @Override
    public void display() {
        System.out.println("I am non veg menu");
    }
}
