public class ObjectOrientedChallenge {
    public static void main(String[] args) {
        // calling constructor without parameters
        Account myAccount = new Account();
        myAccount.setName("Mariya Fatima");
        myAccount.setNumber(911);
        myAccount.setPhoneNumber(90976650);
        myAccount.setBalance(50_000);
        myAccount.setEmail("mariya@gmail.com");
        System.out.println(myAccount.depositFund(100));
        System.out.println(myAccount.withdrawFund(50_000));

        // calling empty constructor and not defining parameters even later
        Account myAccount2 = new Account();
        System.out.println(myAccount2.depositFund(100));
        System.out.println(myAccount2.withdrawFund(50_000));

        // calling constructor with parameters for ease
        Account newAccount = new Account(123, 10_000, "Anas Razy", "razy@gmail.com", 91255748);
        System.out.println(newAccount.depositFund(100));
        System.out.println(newAccount.withdrawFund(5_000));

        // calling constructor chain
        Account newAccount2 = new Account("Ayushi", "ayushipagli@gmail.com", 910285);
        System.out.println(newAccount2.getBalance());
        System.out.println(newAccount2.getName());

    }
}
