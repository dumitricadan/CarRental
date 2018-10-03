package ro.jademy.carrental.car.mercedes;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

import java.math.BigDecimal;

public class Bclasse extends Mercedes{
    public Bclasse(Integer year, Integer doorNumber, String color, Engine engine, BigDecimal basePrice) {
        super("Bclasse", year, CarType.WAGON, doorNumber, color, TransmissionType.MANUAL, engine, basePrice);
    }
}
