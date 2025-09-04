package LeetCodeSolutions;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {

    }

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int current = 0;

    public MinStack() {

    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int currentMin = minStack.peek();
            if (val <= currentMin) {
                minStack.push(val);
            } else {
                minStack.push(currentMin);
            }
        }
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
