package creational.builder;

public class MainClass {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Shashi Kanth", "Bairu")
                .age(21)
                .phone("6303244961")
                .address("address 1234")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Iron", "Man")
                .age(40)
                .phone("1111111111")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
