package ro.jademy.carrental.car.audi;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Afour extends Audi {
    public Afour(Integer year, String carType, Integer doorNumber, String color, String transmissionType, Engine engine, String basePrice) {
        super("Afour", year, CarType.COUPE, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
