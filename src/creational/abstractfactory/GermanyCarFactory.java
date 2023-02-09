package creational.abstractfactory;

public class GermanyCarFactory
{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SUV:
                car = new SUVCar(Location.GERMANY);
                break;

            case SEDAN:
                car = new SedanCar(Location.GERMANY);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.GERMANY);
                break;

            default:
                break;
        }
        return car;
    }
}