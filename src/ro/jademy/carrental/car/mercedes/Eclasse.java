package ro.jademy.carrental.car.mercedes;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Eclasse extends Mercedes {
    public Eclasse(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Eclasse", year, CarType.SEDAN, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
