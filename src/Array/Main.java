package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
//        myIntArray[2] =  "Anas";
        System.out.println(Arrays.toString(myIntArray));


        double[] myDoubleArray = new double[5];
        myDoubleArray[1] = 22.29;
        System.out.println(myDoubleArray[1]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        // for each loop
        // for array or other collection
        // one element at a time, from first element to the last
        /*


        Enhanced for loop:
        for (declaration : collection) {
            **block of statements**
        }
        declaration = type, or variable name, usually a local variable with the same type as an element in the array!

         */

        for (int object : newArray) {
            System.out.print(object + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.println(Arrays.toString(objectArray));
    }
}
