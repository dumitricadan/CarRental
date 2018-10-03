package ro.jademy.carrental.car.dacia;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Sandero extends Dacia{
    public Sandero(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Sandero", year, CarType.HATCHBACK, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
