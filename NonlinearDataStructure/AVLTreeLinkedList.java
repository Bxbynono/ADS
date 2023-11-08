class AVL_Node {
    int key, height;
    AVL_Node left, right;

    public AVL_Node(int key) {
        this.key = key;
        height = 1;
    }
}

class AVLTree {
    AVL_Node root;

    public int height(AVL_Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    public int getBalance(AVL_Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    public AVL_Node rightRotate(AVL_Node y) {
        AVL_Node x = y.left;
        AVL_Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public AVL_Node leftRotate(AVL_Node x) {
        AVL_Node y = x.right;
        AVL_Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public AVL_Node insert(AVL_Node node, int key) {
        if (node == null)
            return new AVL_Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public AVL_Node minValueNode(AVL_Node node) {
        AVL_Node current = node;

        while (current.left != null)
            current = current.left;

        return current;
    }

    public AVL_Node delete(AVL_Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else {
            if ((root.left == null) || (root.right == null)) {
                AVL_Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                AVL_Node temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = delete(root.right, temp.key);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public AVL_Node search(AVL_Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return search(root.left, key);

        return search(root.right, key);
    }

    public void preOrder(AVL_Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);

        System.out.println("AVL Tree after insertion:");
        tree.preOrder(tree.root);
        System.out.println();

        tree.root = tree.delete(tree.root, 20);

        System.out.println("AVL Tree after deletion of key 20:");
        tree.preOrder(tree.root);

        AVL_Node foundNode = tree.search(tree.root, 30);
        if (foundNode != null) {
            System.out.println("\nNode with key 30 found: " + foundNode.key);
        } else {
            System.out.println("\nNode with key 30 not found.");
        }
    }
}