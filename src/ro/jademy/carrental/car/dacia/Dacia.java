package ro.jademy.carrental.car.dacia;


import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;
import ro.jademy.carrental.car.*;



import java.math.BigDecimal;

public abstract class Dacia extends Car {
    public Dacia(String model, Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, BigDecimal basePrice) {
        super("Dacia", model, year, carType, doorNumber, color, transmissionType, engine,  basePrice);
    }
}
