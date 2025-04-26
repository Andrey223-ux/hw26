public class Main {
    public static void main(String[] args) {

        User user = new User("Іван Петренко");

        Address address = new Address("вул. Шевченка, 10", "Київ", "Україна");

        user.setAddress(address);

        System.out.println("Користувач: " + user.getName());
        System.out.println("Адреса користувача: " + user.getAddress());

    }

}