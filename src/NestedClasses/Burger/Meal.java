package NestedClasses.Burger;

import java.util.ArrayList;
import java.util.List;

// this is a part of Bill's Burger Challenge and how we can use Nest classes
public class Meal {

    // How to run: Run 'Store.main()'
    // some fields for meal foods
    private double price = 5.0;
    private Burger burger;
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
        burger = new Burger("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    // getter for total price
    public double getTotal() {
        double toppingTotal = 0;
        for (Item item : burger.toppings) {
            toppingTotal += item.price;
        }

        double total = burger.price + toppingTotal + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }


    // toString() for meal
    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(side, drink, burger,  // 3 strings (each on new line), then 26-char wide right-aligned string + $ + float with 2 decimals
                "Total Due: ", getTotal());
    }

    // add toppings and assign burger
    public void addToppings(Item... toppings) {
        burger.addToppings(toppings); // delegate to Burger
    }

    // Nested class for item
    class Item {

        // some fields
         private String name;
         private String type;
        protected double price;


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

    // Challenge
    // Another inner class called burger
    public class Burger extends Item{

        // specialized item and should also include a list of toppings also items.
        private List<Item> toppings;

        public void addToppings(Item... toppings) {
            for (Item item : toppings) {
                double extra = switch (item.name.toLowerCase()) {
                    case "egg" -> 5.4;
                    case "papaya" -> 1.2;
                    default -> 0;
                };
                item.price = extra;
                this.toppings.add(item); // add to topping list
            }
        }

        // Remember Items have a name , type , price and method to convert prices
        public Burger(String name, String type) {
            super(name, type);
            this.toppings = new ArrayList<>();
        }

        public Burger(String name, String type, double price) {
            super(name, type, price);
            this.toppings = new ArrayList<>();
        }

        @Override
        public String toString() {
            String toppingList = "";
            if (!toppings.isEmpty()) {
                toppingList += "\nToppings:";
                for (Item t : toppings) {
                    toppingList += "\n" + t.toString();
                }
            }

            return super.toString() + toppingList;
        }


    }

}
