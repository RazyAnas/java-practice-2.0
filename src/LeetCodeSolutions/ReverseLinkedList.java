package LeetCodeSolutions;

public class ReverseLinkedList {

    public static void main(String[] args) {

    }

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode reverseList(ListNode current) {

            // base condition
            if (current == null || current.next == null) return current;
            ListNode newHead = reverseList(current.next); // recurrence

            // conditions
            current.next.next = current;
            current.next = null;
            return newHead;


        }
    }
}
