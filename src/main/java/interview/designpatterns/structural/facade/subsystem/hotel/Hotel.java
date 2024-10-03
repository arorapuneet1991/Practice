package interview.designpatterns.structural.facade.subsystem.hotel;

import interview.designpatterns.structural.facade.subsystem.menu.Menus;

public interface Hotel {
    public Menus getMenu();
}
