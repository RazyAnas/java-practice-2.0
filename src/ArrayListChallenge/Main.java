package ArrayListChallenge;
/*
 * The ArrayList Challenge
 *
 * The list will be a grocery list and should be an ArrayList.
 *
 * You should use methods on the ArrayList to:
 * - Add items
 * - Remove items
 * - Check if an item is already in the list
 * - Print a sorted list
 *
 * Rules:
 * - You should print the list sorted alphabetically after each operation.
 * - You shouldn't allow duplicate items in the list.
 *
 * Menu Options:
 * 0 - to shutdown
 * 1 - to add item(s) to list (comma-delimited list)
 * 2 - to remove any items (comma-delimited list)
 *
 * You should use the Scanner class to get menu choices (0, 1, 2)
 * and process the items accordingly.
 */

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> groceries = new ArrayList<>();

    public static ArrayList<String> getGroceries() {
        groceries.sort(Comparator.naturalOrder());
        return groceries;
    }

    public static void main(String[] args) {
        groceries.addAll(List.of(new String[]{"tomato", "potato", "brinjal"}));

        getInput();
    }

// read String
    public static void getInput() {
        System.out.println("Available actions:\n0 - to shutdown\n1 - to add item(s) to list (comma delimited list)\n2- to remove any items (comma delimited list)\n Enter a number for which action you want to do:");
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
//        String[] splitStrings = inputNumbers.split(",");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> {
                    System.out.print("Write all the items you want to add in groceries list separated by comma: ");
                    getList(1);

                    flag = false;
                }
                case 2 -> {
                    System.out.print("Write all the items you want to remove in groceries list separated by comma: ");
                    getList(2);

                    flag = false;
                }
                default -> flag = false;
            }

            getGroceries();
        }
    }

    private static void getList(int choice) {
        String userListedItems = sc.nextLine();
        String[] userGroceries = userListedItems.split(",");

        for (int i = 0; i < userGroceries.length; i++) {
            userGroceries[i] = userGroceries[i].trim();
        }


        boolean hasDuplicate = false;

        for (int i = 0; i < userGroceries.length; i++) {
            for (int j = i + 1; j < userGroceries.length; j++) {
                if (userGroceries[i].equals(userGroceries[j])) {
                    hasDuplicate = true;
                    System.out.println("duplicates are not allowed!");
                    getInput();
                    break;

                }
            }
        }

            if (choice == 1) {
                addItems(userGroceries);
            } else if (choice == 2){
                removeItems(userGroceries);
            }

    }


    private static void addItems(String... userGroceries) {
        boolean alreadyExists = false;
        String alreadyExistsItem = "";
        for (var items : userGroceries) {
            for (var products : groceries) {
                if (Objects.equals(items, products)) {
                    alreadyExists = true;
                    alreadyExistsItem = items;
                }
            }
        } if (alreadyExists) {
            System.out.println("Item already exists: " + alreadyExistsItem + "\n Please try again!");
            getList(1);
        } else {
            groceries.addAll(List.of(userGroceries));
            groceries.sort(Comparator.naturalOrder());
            System.out.println("New grocery list = " + groceries);
            getInput();
        }

    }
    private static void removeItems(String... userGroceries) {
        List<String> userList = new ArrayList<>(List.of(userGroceries));

        if (groceries.containsAll(userList)) {
            try {
                groceries.removeAll(userList);
                System.out.println("item removed: " + userList);
                groceries.sort(Comparator.naturalOrder());
                System.out.println("New Grocery List = " + groceries);
            } catch (Exception e){
                System.out.println("an error occurred while removing items!");
            }
        } else {
            System.out.println("some item(s) listed by you to be removed don't really exist wtf!");
        }

        getInput();

    }
    public static ArrayList<String> makeList(String... args) {
        // comma delimiter -> how? ->

        ArrayList<String> list = new ArrayList<>(List.of(args));
        System.out.println(Arrays.toString(args));
        return list;
    }
}
