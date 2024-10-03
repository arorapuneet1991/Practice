package interview.designpatterns.structural.facade.subsystem.hotel;

import interview.designpatterns.structural.facade.subsystem.menu.Menus;
import interview.designpatterns.structural.facade.subsystem.menu.MixMenu;

public class MixRestaurant implements Hotel {
    @Override
    public Menus getMenu() {
        return new MixMenu();
    }
}
