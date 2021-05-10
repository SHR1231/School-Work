package ABF;

public class TclFactory implements EFfactory{

    @Override
    public Television produceTelevision() {
        return new TclTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TclAirConditioner();
    }
}
