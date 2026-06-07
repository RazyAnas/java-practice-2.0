package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllIterationInSingleCode {
    static List<List<Integer>> parentList = new ArrayList<>();
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
        System.out.println(allIteration(root));
    }
    static List<List<Integer>> allIteration(Node node) {
        NodeState nodeState = new NodeState(node, 1);

        Stack<NodeState> stack = new Stack<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        stack.add(nodeState);
        while (!stack.isEmpty()) {
            NodeState current = stack.pop();
            if (current.state == 1) {
                preOrder.add(current.node.data);
                current.state = 2;
                stack.push(current);
                if (current.node.left != null) {
                    stack.push(new NodeState(current.node.left, 1));
                }
            }
            else if (current.state == 2) {
                inOrder.add(current.node.data);
                current.state = 3;
                stack.push(current);
                if (current.node.right != null) {
                    stack.push(new NodeState(current.node.right, 1));
                }
            }
            else {
                postOrder.add(current.node.data);
            }
        }
        parentList.add(preOrder);
        parentList.add(inOrder);
        parentList.add(postOrder);
        return parentList;
    }
}
class NodeState {
    Node node;
    int state;

    NodeState(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}

