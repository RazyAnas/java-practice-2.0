package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

/*
record gives ClassName[field1=value1, field2=value2]
Each value uses its own .toString()
ArrayList.toString() gives [element1, element2, ...]
 */

record  GroceryItem(String name, String type, int count) {

    public  GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }

}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

//        ArrayList<Integer> objectList = new ArrayList<>();
        ArrayList ObjectList = new ArrayList();
        ObjectList.add(new GroceryItem("Butter"));
        ObjectList.add("Yogurt");
//       diamond operator = <>
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Orange", "PRODUCE", 5));
        groceryList.set(0,new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
