package ro.jademy.carrental.car.audi;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Asix extends Audi {
    public Asix(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Asix", year, CarType.SEDAN, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
