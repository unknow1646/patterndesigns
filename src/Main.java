import patterns.creational.builder.CarBuilder;
import patterns.creational.builder.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.createLuxuryCar(carBuilder);

        System.out.println(carBuilder.getCar());


    }
}