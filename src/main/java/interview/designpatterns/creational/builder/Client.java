package interview.designpatterns.creational.builder;

import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Client.class.getName());
        House house = House.builder().setKitchen("Island").build();

        logger.info(house.getKitchen());
        logger.info(house.getWalls()+"");

    }
}
