package ro.jademy.carrental.car.audi;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public abstract class Audi extends Car {
    public Audi(String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Audi", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
