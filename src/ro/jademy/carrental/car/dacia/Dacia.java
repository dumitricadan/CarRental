package ro.jademy.carrental.car.dacia;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.Car;

public abstract class Dacia extends Car {
    public Dacia(String model, Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Dacia", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
