package ro.jademy.carrental.car.mercedes;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.TransmissionType;

public class Bclasse extends Mercedes{
    public Bclasse(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Bclasse", year, CarType.WAGON, doorNumber, color, TransmissionType.MANUAL, engine, basePrice);
    }
}
