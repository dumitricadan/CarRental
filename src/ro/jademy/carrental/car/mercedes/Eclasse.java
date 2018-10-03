package ro.jademy.carrental.car.mercedes;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Eclasse extends Mercedes {
    public Eclasse(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Eclasse", year, CarType.SEDAN, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
