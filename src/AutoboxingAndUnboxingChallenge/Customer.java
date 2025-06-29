package AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private final String name;
    // double wrapper elements | transaction can be positive (credited) or negative (debited)
    public ArrayList<Double> transaction;

    public Customer(String name, ArrayList<Double> transaction) {
        this.name = name;
        this.transaction = transaction;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Customer name: %s",  getName());
    }
}
