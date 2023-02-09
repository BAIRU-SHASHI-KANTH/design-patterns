package creational.singleton.eagerinitialization;

public class SUVCar {
    private String name;

    private static SUVCar instance = new SUVCar();

    // private constructor
    private SUVCar() {

    }

    public static SUVCar getInstance() {
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SUVCar{" +
                "name='" + name + '\'' +
                '}';
    }
}



