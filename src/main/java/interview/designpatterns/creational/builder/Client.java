package interview.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        House house=House.builder().setKitchen("Island").build();

        System.out.println(house.getKitchen());
        System.out.println(house.getRooms());

    }
}
