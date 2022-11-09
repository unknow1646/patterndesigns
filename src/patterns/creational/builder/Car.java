package patterns.creational.builder;

public class Car {

    private  Integer bigWheels;
    private  Engine  engine;
    private  Boolean leatherSeats;
    private  Integer batteries;
    private  Boolean convertible;
    private  Boolean electricCar;
    private  CarType carType;

    public Car(CarType carType, Integer seats,
               Integer bigWheels, Engine engine, Boolean leatherSeats,
               Integer batteries, Boolean convertible, Boolean electricCar) {
        this.carType = carType;
        this.seats = seats;
        this.bigWheels = bigWheels;
        this.engine = engine;
        this.leatherSeats = leatherSeats;
        this.batteries = batteries;
        this.convertible = convertible;
        this.electricCar = electricCar;
    }

    private  Integer seats;

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getBigWheels() {
        return bigWheels;
    }

    public void setBigWheels(Integer bigWheels) {
        this.bigWheels = bigWheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Boolean getLeatherSeats() {
        return leatherSeats;
    }

    public void setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public Integer getBatteries() {
        return batteries;
    }

    public void setBatteries(Integer batteries) {
        this.batteries = batteries;
    }

    public Boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    public Boolean getElectricCar() {
        return electricCar;
    }

    public void setElectricCar(Boolean electricCar) {
        this.electricCar = electricCar;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bigWheels=" + bigWheels +
                ", engine=" + engine +
                ", leatherSeats=" + leatherSeats +
                ", batteries=" + batteries +
                ", convertible=" + convertible +
                ", electricCar=" + electricCar +
                ", carType=" + carType +
                ", seats=" + seats +
                '}';
    }


}
