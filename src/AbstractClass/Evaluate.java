package AbstractClass;

public class Evaluate {
    public static void main(String[] args) {

        // Create MyLinkedList with first node "30"
        MyLinkedList linkedList = new MyLinkedList(new Node("30"));

        // Add more items
        linkedList.addItem(new Node("20"));
        linkedList.addItem(new Node("40"));
        linkedList.addItem(new Node("10"));
        linkedList.addItem(new Node("50"));
        linkedList.addItem(new Node("30")); // duplicate, should not be added

        System.out.println("After Adding:");
        linkedList.traverse(linkedList.getRoot());

        // Remove few items
        linkedList.removeItem(new Node("10"));  // remove head
        linkedList.removeItem(new Node("30"));  // remove middle
        linkedList.removeItem(new Node("50"));  // remove tail

        System.out.println("After Removing:");
        linkedList.traverse(linkedList.getRoot());
    }
}
