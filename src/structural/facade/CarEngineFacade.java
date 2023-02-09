package structural.facade;


import structural.facade.car.AirFlowController;
import structural.facade.car.CoolingController;
import structural.facade.car.FuelInjector;
import structural.facade.car.Starter;

public class CarEngineFacade {

    private static int DEFAULT_COOLING_TEMP = 90;


    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();


    public void startEngine() {

        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();

    }

    public void stopEngine() {

        fuelInjector.off();
        coolingController.stop();
        airFlowController.off();
    }
}