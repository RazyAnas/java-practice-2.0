package Tree;

public class RepresentationOfBT {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.right.left = new Node(7);

    }
}

class Node {
    int data;
    Node left;
    Node right;
    public Node(int key) {
        this.data = key;
    }
}
