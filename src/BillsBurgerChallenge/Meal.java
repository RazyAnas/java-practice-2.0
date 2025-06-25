package BillsBurgerChallenge;

public class Meal {
    private Burger burger;  // HAS-A
    private Drink drink;  // HAS-A
    private SideItem sideItem;

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void showMeal() {
        System.out.println("Meal has a burger: " + burger.getType());
    }
}
