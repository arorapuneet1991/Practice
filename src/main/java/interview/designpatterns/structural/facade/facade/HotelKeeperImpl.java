package interview.designpatterns.structural.facade.facade;

import interview.designpatterns.structural.facade.subsystem.hotel.MixRestaurant;
import interview.designpatterns.structural.facade.subsystem.hotel.NonVegRestaurant;
import interview.designpatterns.structural.facade.subsystem.hotel.VegRestaurant;
import interview.designpatterns.structural.facade.subsystem.menu.MixMenu;
import interview.designpatterns.structural.facade.subsystem.menu.NonVegMenu;
import interview.designpatterns.structural.facade.subsystem.menu.VegMenu;

public class HotelKeeperImpl implements IHotelKeeper {
    @Override
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenu();
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenu();
    }

    @Override
    public MixMenu getMixMenu() {
        MixRestaurant mixRestaurant = new MixRestaurant();
        return (MixMenu) mixRestaurant.getMenu();
    }
}
