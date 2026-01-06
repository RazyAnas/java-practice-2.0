package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
        System.out.println(iterativePreOrder(root));
    }

    static List<Integer> iterativePreOrder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        stack.add(root);

        while (!stack.empty()) {

            int len = stack.size();
            for (int i = 0; i < len; i++) {
                Node current = stack.pop();
                list.add(current.data);
                // what is preorder:
                // preorder = root, left, right

                if (current.right != null) {
                    stack.add(current.right);
                }
                if (current.left != null) {
                    stack.add(current.left);
                }
            }
        }
        return list;

    }
}
