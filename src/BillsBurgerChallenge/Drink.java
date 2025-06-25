package BillsBurgerChallenge;

public class Drink {
    private String type;
    private String size;
    private double price;
    private int drink;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public double getPrice(String size) {
        return switch (size.toLowerCase()){
            case "small" -> 15;
            case "medium" -> 30;
            case "large" -> 60;
            default -> 0.00;
        };
    }
}
