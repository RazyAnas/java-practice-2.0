package Autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50; // autoboxing
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());
        System.out.println();
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

//        var ourList = getList(1,2,3);
        var ourList = List.of(1,2,3);
        System.out.println(ourList);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

    private static ArrayList<Integer> getList(Integer... varargs) { // Integer can be replaced with int and vice versa, hence wrapper class can almost be used interchangeably with primitive data types!
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static int returnAnInteger(int i) {
        return i;
    }

}
