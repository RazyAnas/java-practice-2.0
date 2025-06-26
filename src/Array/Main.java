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
        newArray = new int[]{5, 4, 3, 2, 1};

        for (int i = 0 ; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

    }
}
