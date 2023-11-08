class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    void insertValues() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

    }

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    int height(Node node) {
        if (node == null)
            return 0;
        else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    void Level(Node node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1) {
            Level(node.left, level - 1);
            Level(node.right, level - 1);
        }
    }

    void levelTraversal(Node root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            Level(root, i);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertValues();

        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();

        System.out.print("Level Traversal: ");
        tree.levelTraversal(tree.root);
        System.out.println();
    }
}