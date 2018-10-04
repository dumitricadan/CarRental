package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Asix extends Audi {
    public Asix(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Asix", year, CarType.SEDAN, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
