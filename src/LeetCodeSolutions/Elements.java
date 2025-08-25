package LeetCodeSolutions;

public class Elements {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        // base condition
        if (head == null) return null;

        head.next = removeElements(head.next, val);

        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}
