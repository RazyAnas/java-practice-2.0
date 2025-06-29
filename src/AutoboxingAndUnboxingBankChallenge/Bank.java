package AutoboxingAndUnboxingBankChallenge;

import java.util.ArrayList;

public class Bank {

    Customer customer; // Bank has a customer
    ArrayList<Customer> customersArrayList;

    public String getName() {
        return "Bank of India";
    }

    public Bank(ArrayList<Customer> customersArrayList) {
        this.customersArrayList = customersArrayList;
    }

    // bank should add a new customer if customer don't already exist in the list
    public void addCustomer(Customer customer) {
        for (Customer existing : customersArrayList) {
            if (existing.getName().equalsIgnoreCase(customer.getName())) {
                System.out.println("Customer already exists! skipping...");
                return;
            }
        }
        customersArrayList.add(customer);
        System.out.println("New customer added --> " + customer.getName());
    }

    public void addTransaction(double amount) {

        customer.transaction.add(amount); // 👈 autoboxing happens here
        // UNBOXING example: using Double to double

    }

    @Override
    public String toString() {
        double total = 0;

        // 👇 Unboxing happens here
        for (Double t : customer.getTransaction()) {
            total += t;
        }

        return customer.getName() +
                " with a balance of ₹" + total +
                " had following transactions: " + customer.getTransaction();
    }

    public ArrayList<Customer> getCustomers() {
        return customersArrayList;
    }
}
