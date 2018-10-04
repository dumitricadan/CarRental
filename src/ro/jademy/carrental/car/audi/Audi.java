package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public abstract class Audi extends Car {
    public Audi(String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, BigDecimal basePrice) {
        super("Audi", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
