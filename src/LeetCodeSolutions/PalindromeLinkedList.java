package LeetCodeSolutions;

import java.util.Stack;

public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
    Stack<Integer> stack = new Stack<>();
    public boolean isPalindrome(ListNode head) {

    ListNode copyHead = new ListNode(head.val, head.next);
        while (copyHead != null) {
            stack.push(copyHead.val);
            copyHead = copyHead.next;
        }
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
