package ro.jademy.carrental.car.dacia;

        import com.sun.xml.internal.ws.api.pipe.Engine;
        import ro.jademy.carrental.car.CarType;
        import ro.jademy.carrental.car.TransmissionType;

public class Logan extends Dacia {
    public Logan(Integer year, CarType carType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, String basePrice) {
        super("Logan", year, CarType.SEDAN, doorNumber, color, TransmissionType.MANUAL, engine, basePrice);
    }
}
