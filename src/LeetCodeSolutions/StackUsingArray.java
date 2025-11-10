package LeetCodeSolutions;

public class StackUsingArray {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }
}

class stack {
    int size = 10000;
    int top  = -1;
    int[] arr = new int[size];

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int top() {
        if (top == -1) {
            return 0;
        }
        return arr[top];
    }

    int pop() { // remove and return top element
        int element = top();
        arr[top] = 0;
        top = top -1;
        return element;
    }

    int size() {
        return top + 1;
    }
}