package structural.adapter;

public class Tesla implements Car {

    private int speed;//speed in kmph

    public Tesla(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "Tesla{" +
                "speed=" + speed +
                " kmph} (INDIA)";
    }
}