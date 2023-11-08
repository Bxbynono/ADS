import java.util.Stack;

class BTNode {
    int data;
    BTNode left, right;

    BTNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    BTNode root;

    BinaryTree() {
        this.root = null;
    }

    void preOrderTraversal(BTNode first) {
        Stack<BTNode> stack = new Stack<>();
        stack.push(first);
        
        while (!stack.isEmpty()) {
            BTNode current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BTNode(1);
        tree.root.left = new BTNode(2);
        tree.root.right = new BTNode(3);
        tree.root.left.left = new BTNode(4);
        tree.root.left.right = new BTNode(5);
        tree.root.right.left = new BTNode(6);

        System.out.println("Pre-order traversal: ");
        tree.preOrderTraversal(tree.root);
    }
}
