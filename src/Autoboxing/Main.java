package Autoboxing;

public class Main {
    public static void main(String[] args) {

        // Manual
        Integer boxedInt = Integer.valueOf(15); // manual boxing - unnecessary
        Integer boxedInt2 = 15; // autoboxing
        // Integer deprecatedBoxing = new Integer(15); // deprecated
        int unboxedInt = boxedInt.intValue(); // manual unboxing - unnecessary
        int unboxedInt2 = boxedInt2; // auto-unboxing

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        System.out.println(autoUnboxed);

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

}
