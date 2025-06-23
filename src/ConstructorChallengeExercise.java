public class ConstructorChallengeExercise {
    public static void main(String[] args) {
        // calling constructor with no-args
        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        // calling constructor with only two parameters that is name and email
        Customer customer2 = new Customer("Anas Razy", "razy7292@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        // calling constructor with all the parameters defined
        Customer customer3 = new Customer("Mariya Fatima", 5_00_000, "fatima@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}
