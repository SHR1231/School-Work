package ABF;

public class HaierFactory implements EFfactory {

    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
