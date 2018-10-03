package ro.jademy.carrental.car.mercedes;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public abstract class Mercedes extends Car {
    public Mercedes(String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, BigDecimal basePrice) {
        super("Mercedes", model, year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
