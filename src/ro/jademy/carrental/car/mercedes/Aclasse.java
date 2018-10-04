package ro.jademy.carrental.car.mercedes;

import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Aclasse extends Mercedes {
    public Aclasse(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Aclasse", year, CarType.HATCHBACK, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
