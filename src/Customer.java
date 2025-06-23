public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    // create only getters for each field.

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // creating constructor for all three field parameter assigning args directly to the instance fields
    public Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // creating no-args constructor that calls another constructor, passing some literal values for each argument.
    public Customer(){
        this("Unknown", 89_000, "default address");
    }

    // creating constructor with just the name and email parameters, which also calls another constructor
    public Customer(String name, String emailAddress){
        this(name, 99_999, emailAddress);
    }
}
