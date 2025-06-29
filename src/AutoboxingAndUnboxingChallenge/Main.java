package AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Create empty customer list for bank
        ArrayList<Customer> customers = new ArrayList<>();

        // 2. Create a new bank
        Bank bank = new Bank(customers);

        // 3. Create customer1 with initial transaction
        ArrayList<Double> transactions1 = new ArrayList<>();
        transactions1.add(1000.0); // autoboxing here
        Customer customer1 = new Customer("Anas", transactions1);
        bank.addCustomer(customer1);

        // 4. Create customer2 with initial transaction
        ArrayList<Double> transactions2 = new ArrayList<>();
        transactions2.add(500.0);
        Customer customer2 = new Customer("Aman", transactions2);
        bank.addCustomer(customer2);

        ArrayList<Double> transactions3 = new ArrayList<>();
        transactions2.add(300.0);
        Customer customer3 = new Customer("Aman", transactions3);
        bank.addCustomer(customer3);
        // 5. Set current active customer in bank
        bank.customer = customer1; // Working with Anas
        // 6. Add some transactions
        bank.addTransaction(200.0);  // credit
        bank.addTransaction(-150.0); // debit
        // 7. Print transaction history
        System.out.println(bank);

        bank.customer = customer2; // Working with Aman
        // 6. Add some transactions
        bank.addTransaction(100000.0);  // credit
        bank.addTransaction(-1.0); // debit
        // 7. Print transaction history
        System.out.println(bank);
        System.out.println(bank.getCustomers());
    }
}
