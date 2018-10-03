package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Afour extends Audi {
    public Afour(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Afour", year, CarType.COUPE, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
