package ro.jademy.carrental.car.mercedes;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Aclasse extends Mercedes {
    public Aclasse(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Aclasse", year, CarType.HATCHBACK, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
