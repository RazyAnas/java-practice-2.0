public class Account {
    // declaring instance variables
    private int number;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    // Constructor
    public Account(){
        this(999, 80_000, "Unknown", "default address", 0);
        System.out.println("Empty constructor was called");
    }
    public Account(int number, int balance, String name, String customerEmail, int customerNumber){
        System.out.println("Account constructor with parameters was called ");
        this.number = number;
        this.balance = balance;
        this.name = name;
        customerEmail = email;
        customerNumber = phoneNumber;
    }
    public Account (String name, String customerEmail, int customerNumber){
        this(789, 123, name, customerEmail, customerNumber);
    }

    // getters and setters for each instance variable
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // additional methods to withdraw and depositing funds
    public String depositFund(int fund){
        setBalance(getBalance()+fund);
        return "Successfully Deposited an amount of " + fund + ", New Balance = " + getBalance();
    }
    public String withdrawFund(int fund){
        // if balance not enough to be withdrawn return a statement else withdraw the desired funds
        if (getBalance()-fund < 0){
            return "Not enough balance to withdraw!";
        } else if (getBalance()-fund >= 0) {
            setBalance(getBalance()-fund);
            return "Successfully Withdrawn an amount of " + fund + ", New Balance = " + getBalance();
        }

        return "An error occurred while withdrawing!";
    }
}
