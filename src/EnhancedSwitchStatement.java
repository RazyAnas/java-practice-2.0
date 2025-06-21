public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        int switchValue = 5;
        switch (switchValue){
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3,4,5 -> {
                System.out.println("Was a 3, 4 or a 5");
                System.out.println("Actually it was a "+switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or a 5");
        }
    }

}
