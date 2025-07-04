package NestedClasses.Burger;

public class Store {
    public static void main(String[] args) {
        // Regular meal object initialize
        Meal regularMeal = new Meal(); // no conversion rate = total * 1
        System.out.println(regularMeal);

        // USRegularMeal with conversion rate --> overloaded
        Meal USRegularMeal = new Meal(0.68); // multiply this by the total
        System.out.println(USRegularMeal);

        Meal regularMeal2 = new Meal();
        regularMeal2.addToppings(
                regularMeal2.new Item("egg", "topping"),
                regularMeal2.new Item("papaya", "topping")
        );
        System.out.println(regularMeal2);

    }
}
