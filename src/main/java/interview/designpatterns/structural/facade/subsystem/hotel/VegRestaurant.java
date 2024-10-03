package interview.designpatterns.structural.facade.subsystem.hotel;

import interview.designpatterns.structural.facade.subsystem.menu.Menus;
import interview.designpatterns.structural.facade.subsystem.menu.VegMenu;

public class VegRestaurant implements Hotel {

    @Override
    public Menus getMenu() {
        return new VegMenu();
    }
}
