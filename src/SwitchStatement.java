public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 8;
        switch (switchValue){
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4 or a 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or a 5");
                break;
        }
    }

}
