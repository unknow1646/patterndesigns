package patterns.creational.builder;

public class Engine {


    private Integer engineCapacity;

    public Engine(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                '}';
    }
}
