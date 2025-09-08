package LeetCodeSolutions;

import java.util.Arrays;
import java.util.Stack;

public class LargestArea {

    public static void main(String[] args) {
        int[] heights = new int[5];
        heights[0] = 3;
        heights[1] = 2;
        heights[2] = 4;
        heights[3] = 6;
        heights[4] = 5;
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        //Use a monotonic increasing stack of indices.
        //For each bar, if current height < height at stack top → pop until stack is valid.
        //Each pop calculates area = height × width (width = distance between current index and previous lower bar).
        //Push index after cleaning.
        //At the end, pop remaining.


        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int currentHeight = heights[i];
            int currentIndex = i;
            while (!stack.isEmpty() && currentHeight < stack.peek()) {
                int popIndex = stack.pop();
                int height = heights[popIndex];
                int width = currentIndex - (stack.isEmpty() ? 0 : stack.peek()+1);
                area = height * width;
            }

            stack.push(i);
        }

        return area;
    }
}
