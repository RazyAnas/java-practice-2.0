package VarArgs;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World again");
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println("_".repeat(20));
        printText(sArray);
    }

    private static void printText(String... textList) {
        System.out.println(textList);
        for (String t : textList) {
            System.out.println(t);
        }
    }

}
