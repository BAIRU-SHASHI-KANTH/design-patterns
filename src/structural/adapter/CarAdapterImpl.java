package structural.adapter;

public class CarAdapterImpl implements CarAdapter {

    private int speed;
    private Car luxuryCars;

    public CarAdapterImpl(Car tesla) {
        luxuryCars=tesla;
        convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public int convertMPHtoKMPH(int kmph) {
        speed=(int)(kmph/1.60934);
        return speed;
    }

    @Override
    public String toString() {
        return "CarAdapterImpl{" +
                "speed=" + speed +
                " mph} (USA)";
    }
}