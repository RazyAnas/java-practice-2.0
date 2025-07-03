package NestedClasses.Burger;

// this is a part of Bill's Burger Challenge and how we can use Nest classes
public class Meal {

    private double price = 5.0;
    private Item burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this(1); // no conversion rate as multiplying any number by one returns the same value!
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Item("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {

        double total = burger.price + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: ", getTotal());
    }

    private class Item {

         private String name;
         private String type;
         private double price;

         public Item(String name, String type) {
             this(name, type, type.equals("burger") ? Meal.this.price : 0); // if the item is burger base price is valid, inner class has direct access to the outer class attributes even private ones
         }

         public Item(String name, String type, double price) {
             this.name = name;
             this.type = type;
             this.price = price;
         }

         @Override
         public String toString() {
             return "%10s%15s $%.2f".formatted(type, name,
                     getPrice(price, conversionRate));
         }

         private static double getPrice(double price, double rate) {
             return price * rate;
         }

     }

}
