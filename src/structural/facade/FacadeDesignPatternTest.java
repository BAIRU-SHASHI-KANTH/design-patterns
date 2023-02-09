package structural.facade;

public class FacadeDesignPatternTest
{
    public static void main(String []args)
    {
        CarEngineFacade carEngine=new CarEngineFacade();

        System.out.println("* Starting Engine *");
        carEngine.startEngine();

        System.out.println("\n* Stoping Engine *");
        carEngine.stopEngine();

    }
}
