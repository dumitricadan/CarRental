package ro.jademy.carrental.car;

public class Engine {
    private FuelType fuelType;
    private int capacity;
    private int horsepower;

    public Engine(FuelType fuelType, int capacity, int horsepower) {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.horsepower = horsepower;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
