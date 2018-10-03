package ro.jademy.carrental.car.audi;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Asix extends Audi {
    public Asix(Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Asix", year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
