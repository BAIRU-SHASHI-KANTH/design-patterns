package creational.singleton.lazyinitialization;

public class SUVCar {
    private String name;

    private static SUVCar instance = null;

    // private constructor
    private SUVCar() {

    }

    public static SUVCar getInstance() {
        if (instance == null) {
          {
                instance = new SUVCar();
            }
        }
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



