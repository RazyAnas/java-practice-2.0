package Tree;

public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        inorder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    // depth first traversal --> inorder, preorder, postorder traversal
    // inorder traversal (left, root, right)
    static void inorder(Node node){
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data);
        System.out.print(" ");
        inorder(node.right);
    }

    // pre-order traversal (root, left, right)
    static void preOrder(Node node){
        if (node == null) {
            return;
        }

        System.out.print(node.data);
        System.out.print(" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // post-order traversal (left, right, root)
    static void postOrder(Node node){
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
        System.out.print(" ");
    }

}


