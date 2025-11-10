package LeetCodeSolutions;

public class QueueUsingArray {

    public static void main(String[] args) {
        queue q = new queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);

        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}

class queue {
    int size;
    int[] arr;
    int start = -1, end = -1;

    queue(int x) {
        size = x;
        this.arr = new int[size];  // ✅ initialize the field, not a local var
    }

    void push(int x) {
        if (end == size - 1) {
            System.out.println("Queue overflow");
            return;
        }
        if (start == -1) start = 0; // first element
        end++;
        arr[end] = x;
    }

    int top() {
        if (start == -1 || start > end) { // ✅ empty check
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    int pop() {
        if (start == -1 || start > end) { // ✅ underflow check
            System.out.println("Queue underflow");
            return -1;
        }
        int element = arr[start];
        start++;
        return element;
    }

    int size() {
        if (start == -1 || start > end) return 0; // ✅ safe size
        return end - start + 1;
    }
}
