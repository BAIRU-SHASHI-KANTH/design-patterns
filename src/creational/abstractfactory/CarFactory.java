package creational.abstractfactory;

public class CarFactory
{
    private CarFactory() {

    }

    public static Car buildCar(CarType type)
    {
        Car car = null;
        Location location = Location.INDIA; //can be changed to other Factory (Location) .

        switch(location)
        {
            case INDIA:
                car = IndianCarFactory.buildCar(type);
                break;
            case GERMANY:
                car = GermanyCarFactory.buildCar(type);
                break;
            default:
                break;
        }
        return car;
    }
}