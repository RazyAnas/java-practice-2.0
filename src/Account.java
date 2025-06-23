public class Account {
    private int number;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    // getters and setters

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
        if (getBalance()-fund < 0){
            return "Not enough balance to withdraw!";
        } else if (getBalance()-fund >= 0) {
            setBalance(getBalance()-fund);
            return "Successfully Withdrawn an amount of " + fund + ", New Balance = " + getBalance();
        }

        return "An error occurred while withdrawing!";
    }
}
