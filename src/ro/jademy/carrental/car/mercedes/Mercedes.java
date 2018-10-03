package ro.jademy.carrental.car.mercedes;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public abstract class Mercedes extends Car {
    public Mercedes(String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Mercedes", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
