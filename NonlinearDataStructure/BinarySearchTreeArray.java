class BinarySearchTree {
    int[] treeArray;
    int size;

    public BinarySearchTree(int capacity) {
        treeArray = new int[capacity];
        size = 0;
    }

    void insert(int value) {
        if (size == treeArray.length) {
            System.out.println("BST is full. Cannot insert " + value);
            return;
        }

        if (size == 0) {
            treeArray[0] = value; // If the tree is empty, set the root to the new value.
        } else {
            insertion(0, value);
        }

        size++;
    }

    void insertion(int index, int value) {
        if (value < treeArray[index]) {
            // Go to the left subtree
            int leftChild = 2 * index + 1;
            if (treeArray[leftChild] == 0) {
                treeArray[leftChild] = value; // Insert as a leaf node
            } else {
                insertion(leftChild, value); // Recursively insert in the left subtree
            }
        } else {
            // Go to the right subtree
            int rightChild = 2 * index + 2;
            if (treeArray[rightChild] == 0) {
                treeArray[rightChild] = value; // Insert as a leaf node
            } else {
                insertion(rightChild, value); // Recursively insert in the right subtree
            }
        }
    }

    void inorderedTraversal(int index) {
        if (index < size) {
            if (treeArray[2 * index + 1] != 0) {
                inorderedTraversal(2 * index + 1); // Traverse left subtree
            }
            System.out.print(treeArray[index] + " ");
            if (treeArray[2 * index + 2] != 0) {
                inorderedTraversal(2 * index + 2); // Traverse right subtree
            }
        }
    }

    boolean search(int value) {
        return search(0, value);
    }

    boolean search(int index, int value) {
        if (index < size) {
            if (treeArray[index] == value) {
                return true;
            } else if (value < treeArray[index]) {
                return search(2 * index + 1, value); // Search in the left subtree
            } else {
                return search(2 * index + 2, value); // Search in the right subtree
            }
        }
        return false; // Value not found
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(10);

        tree.insert(10);
        tree.insert(5);
        tree.insert(4);
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);

        System.out.println("Inordered Traversal:");
        tree.inorderedTraversal(0);
        System.out.println();

        System.out.println("Search for 7: " + tree.search(7));
        System.out.println("Search for 11: " + tree.search(11));
    }
}
