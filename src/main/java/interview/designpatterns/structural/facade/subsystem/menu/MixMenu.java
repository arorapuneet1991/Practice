package interview.designpatterns.structural.facade.subsystem.menu;

public class MixMenu implements Menus {
    @Override
    public void display() {
        System.out.println("I am mix menu");
    }
}
