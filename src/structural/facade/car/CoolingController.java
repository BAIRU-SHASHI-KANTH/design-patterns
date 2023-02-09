package structural.facade.car;

public class CoolingController {

    private float temperatureUpperLimit;

    public void run()
    {
        System.out.println("CoolingController : RUN");
    }

    public void stop()
    {
        System.out.println("CoolingController : STOP");
    }

    public void setTemperatureUpperLimit(float temp)
    {
        temperatureUpperLimit=temp;
        System.out.println("Temperature Upper Limit : "+temp);
    }

    {

    }

}
