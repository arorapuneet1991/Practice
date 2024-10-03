package interview.designpatterns.structural.facade.facade;

import interview.designpatterns.structural.facade.subsystem.menu.MixMenu;
import interview.designpatterns.structural.facade.subsystem.menu.NonVegMenu;
import interview.designpatterns.structural.facade.subsystem.menu.VegMenu;

public interface IHotelKeeper {
    VegMenu getVegMenu();
    NonVegMenu getNonVegMenu();
    MixMenu getMixMenu();
}
