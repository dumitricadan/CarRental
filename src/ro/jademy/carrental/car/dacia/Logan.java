package ro.jademy.carrental.car.dacia;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Logan extends Dacia {
    public Logan(Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Logan", year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
