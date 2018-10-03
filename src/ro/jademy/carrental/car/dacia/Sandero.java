package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Sandero extends Dacia{
    public Sandero(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Sandero", year, CarType.HATCHBACK, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
