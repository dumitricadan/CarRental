package ro.jademy.carrental.car.dacia;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Duster extends Dacia {
    public Duster(Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Duster",year, carType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
