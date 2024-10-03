package interview.designpatterns.structural.facade.subsystem.hotel;

import interview.designpatterns.structural.facade.subsystem.menu.Menus;
import interview.designpatterns.structural.facade.subsystem.menu.NonVegMenu;

public class NonVegRestaurant implements Hotel{
    @Override
    public Menus getMenu() {
        return new NonVegMenu();
    }
}
