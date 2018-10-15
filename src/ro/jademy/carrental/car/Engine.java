package ro.jademy.carrental.car;

public class Engine implements Comparable<Engine> {
    private FuelType fuelType;
    private Integer capacity;
    private Integer horsepower;

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

    @Override
    public int compareTo(Engine o) {
        int fuelTypeCompare = fuelType.compareTo(o.getFuelType());
        if(fuelTypeCompare != 0) {
            return fuelTypeCompare;
        }
        int capacityCompare = capacity.compareTo(o.getCapacity());
        if(capacityCompare != 0) {
            return capacityCompare;
        }
        int horsePowerCompare = horsepower.compareTo(o.getHorsepower());
        if(horsePowerCompare != 0) {
            return capacityCompare;
        }


        return 0;
    }
}
