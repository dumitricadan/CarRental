package ro.jademy.carrental.car;



import java.math.BigDecimal;
import java.util.Objects;

public abstract class Car implements Comparable<Car> {

    // Q: how can we better represent the car make?
    protected String make;
    protected String model;
    protected Integer year;
    protected CarType carType;
    // Q: how can we better represent the motor type?
    protected Integer doorNumber;
    protected String color;
    // Q: how can we better represent the transmission type?
    protected TransmissionType transmissionType; // automatic, manual
    // Q: how can we better represent the engine?
    protected Engine engine;
    // Q: how can we better represent money value?
    protected BigDecimal basePrice;

    protected CarState carState = new CarState();

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?

    public Car(String make, String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, BigDecimal basePrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.basePrice = basePrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public Engine getEngine() {
        return engine;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public CarState getCarState() {
        return carState;
    }

    public void showCarDetails() {
        String result = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15d%-15s%-15s",make, model, year.toString(), carType.toString(),
                doorNumber.toString(), color, transmissionType.toString(), engine.getCapacity(), engine.getHorsepower(), engine.getFuelType().toString()
        , basePrice.toString());
        System.out.println(result);
    }

    @Override
    public int compareTo(Car o) {
        int makeCompare = make.compareTo(o.make);
        if (makeCompare != 0) {
            return makeCompare;
        }

        int modelCompare = model.compareTo(o.model);
        if (modelCompare != 0) {
            return modelCompare;
        }

        int doorNumberCompare = doorNumber.compareTo(o.doorNumber);
        if (doorNumberCompare != 0) {
            return doorNumberCompare;
        }

        int engineCompare = engine.compareTo(o.getEngine());
        if(engineCompare != 0) {
            return engineCompare;
        }

        int priceCompare = basePrice.compareTo(o.getBasePrice());
        if(priceCompare != 0) {
            return priceCompare;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(year, car.year) && carType == car.carType && Objects.equals(doorNumber, car.doorNumber) && Objects.equals(color, car.color) && transmissionType == car.transmissionType && Objects.equals(engine, car.engine) && Objects.equals(basePrice, car.basePrice) && Objects.equals(carState, car.carState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, carType, doorNumber, color, transmissionType, engine, basePrice, carState);
    }
}
