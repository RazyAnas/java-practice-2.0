package LeetCodeSolutions;

public class LinkedListCycle {

     static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
     }



    public static void main(String[] args) {
        int[] arr = {-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5};

        // build list
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        // cycle check should be false
        System.out.println(hasCycle(head));
    }


    public static boolean hasCycle(ListNode head) {

        // first we need to make two pointers
        ListNode slow = head != null ? head : null; // slow pointer
        ListNode fast = (head != null && head.next != null) ? head : null; // fast pointer

        while (slow != null && fast != null && slow.next != null && fast.next.next != null) {
            slow = slow.next;
            if (fast == slow) return true;
            fast = fast.next.next;
            if (fast == slow) return true;
        }

        return false;
    }
}
