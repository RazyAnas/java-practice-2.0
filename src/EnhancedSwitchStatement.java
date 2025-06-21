public class EnhancedSwitchStatement {
    public static void main(String[] args) {
//        int switchValue = 5;
//        switch (switchValue){
//            case 1 -> System.out.println();
//            case 2 -> System.out.println();
//            case 3,4,5 -> {
//                System.out.println("Was a 3, 4 or a 5");
//                System.out.println("Actually it was a "+switchValue);
//            }
//            default -> System.out.println("Was not 1, 2, 3, 4 or a 5");
//        }
        System.out.println(getQuarter("asd"));
    }
    public static String getQuarter(String month){
//        switch (month){
//            case "JANUARY":
//            case "FEBRUARU":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAY":
//            case "JUNE":
//                return "2nd";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3rd";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                return "4th";
//        }
//        return "bad";

        // Enhanced Switch
        return switch (month){
            case "JANUARY", "FEBRUARU", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" ->"4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; // yield statement must be inside a code block in curly braces
            }
        };

    }

}
