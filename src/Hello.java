public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;

        // Check Alien or not an Alien
        if (!isAlien) {
            System.out.println("No, It is not an Alien!");
            System.out.println("And I am scared of Aliens.");
        }

        int topScore = 80;
        if (topScore == 100){
            System.out.println("You got the Highest Score!");
        }
        if (topScore > 100){
            System.out.println("You got the more than Highest Score!");
        }
        if (topScore >= 100){
            System.out.println("You got the Highest Score!");
        }
        if (topScore < 100){
            System.out.println("You got less Score!");
        }
        if (topScore <= 100){
            System.out.println("You got the Highest Score!");
        }

        int secondTopScore = 60;

        // both conditions must be true!
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than the Second Top Score and less than 100");
        }

        // either/or condition true?
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is True");
        }
        boolean isCar = false;

        // ! exclamation mark, or NOT operator is also known as Logical Complement Operator.
        if (!isCar){
            System.out.println("This is not supposed to happen!");
        }

        // ternary operator --> condition ? assign : or else assign
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is Domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not Domestic";
        System.out.println(s);
    }
}
