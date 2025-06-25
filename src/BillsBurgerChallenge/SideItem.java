package BillsBurgerChallenge;

public class SideItem {
    private String type;
    private double price;
    private int sideItem;

    public SideItem(String type, double price, int sideItem) {
        this.type = type;
        this.price = price;
        this.sideItem = sideItem;
    }

    public String getType() {
        return type;
    }

    public double getPrice(String type) {
        return switch (type.toLowerCase()){
            case "fries" -> 25;
            case "chocolate" -> 10;
            case "soup" -> 50;
            default -> 0.00;
        };
    }

}
