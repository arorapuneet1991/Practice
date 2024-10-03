package interview.designpatterns.structural.facade;

import interview.designpatterns.structural.facade.facade.HotelKeeperImpl;
import interview.designpatterns.structural.facade.facade.IHotelKeeper;
import interview.designpatterns.structural.facade.subsystem.menu.VegMenu;

public class Client {
    public static void main(String[] args) {
        IHotelKeeper hotelKeeper = new HotelKeeperImpl();
        VegMenu vegMenu = hotelKeeper.getVegMenu();
        vegMenu.display();
    }
}
