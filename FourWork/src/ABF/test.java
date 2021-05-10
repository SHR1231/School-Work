package ABF;

public class test {
    public static void main(String[] args){
        EFfactory haier=new HaierFactory();
        AirConditioner haierAirCondition=haier.produceAirConditioner();
        haierAirCondition.changeTemperture();
        Television haierTelevision=haier.produceTelevision();
        haierTelevision.play();

        EFfactory tcl=new TclFactory();
        AirConditioner tclAircondition=tcl.produceAirConditioner();
        tclAircondition.changeTemperture();
        Television tclTelvisio=tcl.produceTelevision();
        tclTelvisio.play();

    }

}
