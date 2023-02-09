package creational.factory;

public class SUV extends Car {

    SUV() {
        super(CarType.SUV);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building SUV(Sports Utility Vehicle) car");
        // add accessories
    }
}