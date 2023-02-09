package creational.abstractfactory;

public class IndianCarFactory
{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SUV:
                car = new SUVCar(Location.INDIA);
                break;

            case SEDAN:
                car = new SedanCar(Location.INDIA);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;

            default:
                //throw some exception
                break;
        }
        return car;
    }
}