package Tree;
import java.util.*;

// breadth first traversal (BFT) --> Level order
public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.levelOrderTraversal(root);
    }
    void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> twoDList = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // number of nodes in this level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll(); // remove from front
                level.add(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            twoDList.add(level);
        }

        System.out.println(twoDList);
    }

}

