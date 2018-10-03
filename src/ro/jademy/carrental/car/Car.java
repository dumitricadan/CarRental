package ro.jademy.carrental.car;

import com.sun.xml.internal.ws.api.pipe.Engine;

public abstract class Car {

    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;
    private CarType carType;
    // Q: how can we better represent the motor type?
    private Integer doorNumber;
    private String color;
    // Q: how can we better represent the transmission type?
    private TransmissionType transmissionType; // automatic, manual
    // Q: how can we better represent the engine?
    private Engine engine;
    // Q: how can we better represent money value?
    private String basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?


    public Car(String make, String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
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
