import patterns.creational.builder.CarBuilder;
import patterns.creational.builder.Director;
import patterns.creational.singleton.Database;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.createLuxuryCar(carBuilder);
        System.out.println(carBuilder.getCar());
        System.out.println("---------------------------------");

        Database database1 = Database.getInstance();
        System.out.println(database1.getInfo()); //Initial class info

        Database database2 = Database.getInstance();
        database2.setInfo("New Info set");

        System.out.println(database1.getInfo()); // NEW INFO SET
        System.out.println(database2.getInfo()); // NEW INFO SET
    }
}