package ro.jademy.carrental.car;

import com.sun.xml.internal.ws.api.pipe.Engine;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;
    // Q: how can we better represent the car type?
    public String carType; // coupe, sedan, hatchback, convertible, wagon, SUV (ENUM)
    // Q: how can we better represent the motor type?
    public Integer doorNumber;
    public String color;
    // Q: how can we better represent the transmission type?
    public String transmissionType; // automatic, manual
    // Q: how can we better represent the engine?
    public Engine engine;
    // Q: how can we better represent money value?
    public String basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?


    public Car(String make, String model, Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
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
}
