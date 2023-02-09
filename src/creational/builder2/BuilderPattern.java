package creational.builder2;

public class BuilderPattern {

    public static void main(String[] args) {

        Computer computerOne = new Computer.ComputerBuilder(
                "2 TB", "32 GB").setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true).build();

        System.out.println(computerOne);

        Computer computerTwo= new Computer.ComputerBuilder(
                "500 GB", "16 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        System.out.println(computerTwo);
    }

}
