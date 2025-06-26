package TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        System.out.println(Arrays.toString(array));
        System.out.println("array.length = " + array.length);

        for (int[] outer : array) {
            System.out.println(Arrays.toString(outer));
        }

//        for (int i = 0; i < array.length; i++) {
//            var innerArray = array[i];
//            for (int j = 0; j < innerArray.length; j++) {
//                System.out.println(array[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (var outer: array) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
