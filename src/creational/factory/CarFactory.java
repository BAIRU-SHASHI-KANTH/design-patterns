package creational.factory;

public class CarFactory {
    public static Car buildCar(CarType model) {

        Car car = null;

        switch (model) {
            case SUV:
                         car = new SUV();
                         break;

            case SEDAN:
                          car = new SedanCar();
                          break;

            case LUXURY:
                         car = new LuxuryCar();
                         break;

            default:
                     break;
        }

        return car;
    }
}