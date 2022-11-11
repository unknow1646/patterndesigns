package patterns.creational.singleton;

public class Database {

    private static Database INSTANCE;
    private String info = "Initial info class";

    private Database() {
    }

    public static Database getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Database();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
