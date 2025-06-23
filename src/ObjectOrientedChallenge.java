public class ObjectOrientedChallenge {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setName("Mariya Fatima");
        myAccount.setNumber(911);
        myAccount.setPhoneNumber(90976650);
        myAccount.setBalance(50_000);
        myAccount.setEmail("mariya@gmail.com");
        System.out.println(myAccount.depositFund(100));
        System.out.println(myAccount.withdrawFund(50_000));

    }
}
