package BillsBurgerChallenge;

public class Burger {
    private String type;
    private double price;
    private String toppings;

    public Burger(String type, double price, String toppings) {
        this.type = type;
        this.price = price;
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void deluxeBurger(){

    }
}
