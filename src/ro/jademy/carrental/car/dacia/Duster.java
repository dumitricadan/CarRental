package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Duster extends Dacia {

    public Duster(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Duster",year, CarType.SUV, doorNumber, color, TransmissionType.MANUAL, engine, basePrice);
    }
}
