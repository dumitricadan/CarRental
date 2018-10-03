package ro.jademy.carrental.car.audi;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Qseven extends Audi {
    public Qseven(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Qseven", year, CarType.SUV, doorNumber, color, TransmissionType.AUTOMATIC, engine, basePrice);
    }
}
