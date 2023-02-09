package creational.abstractfactory;


public class SUVCar extends Car
{
    public SUVCar(Location location)
    {
        super(CarType.SUV, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building SUV car");

    }
}