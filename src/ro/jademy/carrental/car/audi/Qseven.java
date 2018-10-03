package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Qseven extends Audi {
    public Qseven(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Qseven", year, CarType.SUV, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
