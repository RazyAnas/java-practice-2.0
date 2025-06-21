public class SwitchExpressionChallenge {
    public static void main(String[] args) {
        printDayOfWeek(2);
    }
    public static void printDayOfWeek(int day){

        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> day + " is not a valid week nth day!";
        };

        System.out.println(dayOfTheWeek);
    }
}
