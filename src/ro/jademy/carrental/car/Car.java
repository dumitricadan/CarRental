package ro.jademy.carrental.car;



import java.math.BigDecimal;

public abstract class Car {

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
}
