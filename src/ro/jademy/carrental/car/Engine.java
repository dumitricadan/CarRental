package ro.jademy.carrental.car;

public class Engine {
   private String fuelType;
   private String capacity;
   private int horsepower;

    public Engine(String fuelType, String capacity, int horsepower) {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.horsepower = horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getCapacity() {
        return capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
