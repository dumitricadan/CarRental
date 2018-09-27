package ro.jademy.carrental.car.dacia;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Sandero extends Dacia{
    public Sandero(Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Sandero", year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
