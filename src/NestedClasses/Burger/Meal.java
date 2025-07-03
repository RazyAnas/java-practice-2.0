package NestedClasses.Burger;

// this is a part of Bill's Burger Challenge and how we can use Nest classes
public class Meal {

    // How to run: Run 'Store.main()'
    // some fields for meal foods
    private double price = 5.0;
    private Item burger;
    private Item drink;
    private Item side;
    // field to initialize conversionRate --> US
    private double conversionRate;

    public Meal() {
        this(1); // no conversion rate as multiplying any number by one returns the same value!
    }

    // constructor
    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Item("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    // getter for total price
    public double getTotal() {

        double total = burger.price + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    // toString() for meal
    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,  // 3 strings (each on new line), then 26-char wide right-aligned string + $ + float with 2 decimals
                "Total Due: ", getTotal());
    }

    // Nested class for item
    private class Item {

        // some fields
         private String name;
         private String type;
         private double price;

         // Constructor --> that also sets base price for burger from the meal burger
         public Item(String name, String type) {
             this(name, type, type.equals("burger") ? Meal.this.price : 0); // if the item is burger base price is valid, inner class has direct access to the outer class attributes even private ones.
         }

         // constructor with price field
         public Item(String name, String type, double price) {
             this.name = name;
             this.type = type;
             this.price = price;
         }

         // item toString() method
         @Override
         public String toString() {
             return "%10s%15s $%.2f".formatted(type, name, // 10-wide right-aligned string, 15-wide right-aligned string, space, $, float with 2 decimals.
                     getPrice(price, conversionRate));
         }

         // getter for Item Price
         private static double getPrice(double price, double rate) {
             return price * rate;
         }

     }

}
