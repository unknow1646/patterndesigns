package patterns.creational.builder;

public class Director {
    public void createLuxuryCar(Builder builder){
        builder.setCarType(CarType.LUXURY);
        builder.setBatteries(1);
        builder.setWheels(4);
        builder.setEngine(new Engine(200));
    }
}
