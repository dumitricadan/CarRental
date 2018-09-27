package ro.jademy.carrental.car.audi;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.Car;

public abstract class Audi extends Car {
    public Audi(String model, Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Audi", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
