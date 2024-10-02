package interview.designpatterns.creational.builder;

public class House {
    private int walls;
    private int parkingSpaces;
    private String kitchen;
    private boolean swimmingPool;

    public int getWalls() {
        return walls;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public String getKitchen() {
        return kitchen;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.kitchen = builder.kitchen;
        this.parkingSpaces = builder.parkingSpaces;
        this.swimmingPool = builder.swimmingPool;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public static class HouseBuilder {
        private int walls;
        private int parkingSpaces;
        private String kitchen;
        private boolean swimmingPool;

        public HouseBuilder setWalls(int walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setParkingSpaces(int parkingSpaces) {
            this.parkingSpaces = parkingSpaces;
            return this;
        }

        public HouseBuilder setKitchen(String kitchen) {
            this.kitchen = kitchen;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}