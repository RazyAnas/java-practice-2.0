public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));
    }
    public static double convertToCentimeters(int inches){
        return inches * (1/0.3937);
    }
    public static double convertToCentimeters(int feet, int inches){
        int onlyInches = feet*12 + inches;
        return convertToCentimeters(onlyInches);
    }

}
