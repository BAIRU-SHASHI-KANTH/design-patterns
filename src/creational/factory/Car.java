package creational.factory;

public abstract class Car {

    private CarType model = null;

    public Car(CarType model) {
        this.model = model;
    }

    protected abstract void construct();

    public void setModel(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }
}