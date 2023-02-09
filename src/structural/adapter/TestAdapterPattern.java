package structural.adapter;

public class TestAdapterPattern {

    static public void main(String []args)
    {
        Car Tesla = new Tesla(320);
        System.out.println(Tesla.toString());

        CarAdapter TeslaAdapter = new CarAdapterImpl(Tesla);
        System.out.println(TeslaAdapter.toString());

        System.out.print("Speed in mph : "+TeslaAdapter.getSpeed());
    }

}
