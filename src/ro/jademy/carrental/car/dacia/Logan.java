package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.TransmissionType;
import java.math.BigDecimal;

public class Logan extends Dacia {
    public Logan(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Logan", year, CarType.SEDAN, doorNumber, color, TransmissionType.MANUAL, engine, basePrice);
    }
}
