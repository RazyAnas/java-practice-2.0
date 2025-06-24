package StringFormats;

public class Main {
    public static void main(String[] args) {
        String textBlock = """
            I am a text block and I can do the following:
            Change line whenever I wish.
                or, even change tab whenever I want!
                    So, be afraid of me as I may bomb you.
            Thanks,
            Most Cruel,
            Anas Razy
            """;
        System.out.println(textBlock);

        for (int  i = 1; i <= 10000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }
        int age = 35;
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}

