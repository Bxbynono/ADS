class Node {
    int value;
    Node left, right;

    public Node(int num) {
        value = num;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void insert(int value) {
        root = insertion(root, value);
    }

    Node insertion(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value)
            root.left = insertion(root.left, value);
        else if (value > root.value)
            root.right = insertion(root.right, value);

        return root;
    }

    void inorderedTraversal(Node node) {
        if (node != null) {
            inorderedTraversal(node.left);
            System.out.print(node.value + " ");
            inorderedTraversal(node.right);
        }
    }

    void preorderedTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderedTraversal(node.left);
            preorderedTraversal(node.right);
        }
    }

    void postorderedTraversal(Node node) {
        if (node != null) {
            postorderedTraversal(node.left);
            postorderedTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    boolean search(int value) {
        return search(root, value);
    }

    boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }
        if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    void deletion(int value) {
        root = delete(root, value);
    }

    Node delete(Node node, int value) {
        if (node == null) {
            return node;
        }
        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.value = minValue(node.right);
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(4);
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(20);

        System.out.println("Inordered Traversal:");
        tree.inorderedTraversal(tree.root);
        System.out.println();

        System.out.println("Preordered Traversal:");
        tree.preorderedTraversal(tree.root);
        System.out.println();

        System.out.println("Postordered Traversal:");
        tree.postorderedTraversal(tree.root);

        System.out.println();
        System.out.println("Search for 7: " + tree.search(7));
        System.out.println("Search for 11: " + tree.search(11));

        // Delete a node
        tree.deletion(8);
        System.out.println("Inordered Traversal after deleting 8:");
        tree.inorderedTraversal(tree.root);
        System.out.println();
        tree.deletion(8);
        System.out.println("PostOrdered Traversal after deleting 8:");
        tree.postorderedTraversal(tree.root);
        System.out.println();

        tree.deletion(8);
        System.out.println("Preordered Traversal after deleting 8:");
        tree.preorderedTraversal(tree.root);
    }
}
