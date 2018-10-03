package ro.jademy.carrental.car;

public class Engine {
   private FuelType fuelType;
   private String capacity;
   private int horsepower;

    public Engine(FuelType fuelType, String capacity, int horsepower) {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.horsepower = horsepower;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String getCapacity() {
        return capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
