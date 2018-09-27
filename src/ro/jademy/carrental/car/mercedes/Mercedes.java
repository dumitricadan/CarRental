package ro.jademy.carrental.car.mercedes;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.Car;

public abstract class Mercedes extends Car {
    public Mercedes(String model, Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Mercedes", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
