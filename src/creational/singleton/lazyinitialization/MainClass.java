package creational.singleton.lazyinitialization;

public class MainClass {

    public static void main(String []args){

        SUVCar car= SUVCar.getInstance();
        car.setName("Hyundai Creta");
        System.out.println(car.toString()+" { hashCode : "+car.hashCode()+" }");

        SUVCar car1= SUVCar.getInstance();
        car1.setName("Mahindra Scorpio");
        System.out.println(car1.toString()+" { hashCode : "+car1.hashCode()+" }");

    }
}
