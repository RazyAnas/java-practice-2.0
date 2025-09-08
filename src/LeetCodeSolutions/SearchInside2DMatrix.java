package LeetCodeSolutions;

public class SearchInside2DMatrix {

    public static void main(String[] args) {

    }


    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = findInsideArray(matrix, mid, target);
            if (result == 0) {
                return true;
            }
            else if (result == 1) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static int findInsideArray(int[][] matrix, int mid, int target) {
        int[] miniMatrix = matrix[mid];
        int low = 0;
        int high = miniMatrix.length - 1;
        if (target < miniMatrix[0]) return 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (miniMatrix[middle] == target) return 0;
            else if (miniMatrix[middle] > target) {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return -1;
    }

}
