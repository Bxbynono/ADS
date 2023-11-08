public class BinaryTreeUsingArray {
    private int[] tree;

    public BinaryTreeUsingArray(int size) {
        tree = new int[size];
    }

    public void insert(int d) {
        int i = 0;
        while (tree[i] != 0) {
            if (d < tree[i]) {
                i = (2 * i) + 1;
            } else {
                i = (2 * i) + 2;
            }
        }
        tree[i] = d;
    }

    public boolean find(int d) {
        int i = 0;
        while (i < tree.length) {
            if (d < tree[i]) {
                i = (2 * i) + 1;
            } else if (d > tree[i]) {
                i = (2 * i) + 2;
            } else {
                return true;
            }
        }
        return false;
    }

    public void inorderTraversal(int i) {
        if (i < tree.length && tree[i] != 0) {
            inorderTraversal(2 * i + 1);
            System.out.print(tree[i] + " ");
            inorderTraversal(2 * i + 2);
        }
    }

    public void preorderTraversal(int i) {
        if (i < tree.length && tree[i] != 0) {
            System.out.print(tree[i] + " ");
            preorderTraversal(2 * i + 1);
            preorderTraversal(2 * i + 2);
        }
    }

    public void postorderTraversal(int i) {
        if (i < tree.length && tree[i] != 0) {
            postorderTraversal(2 * i + 1);
            postorderTraversal(2 * i + 2);
            System.out.print(tree[i] + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeUsingArray tree = new BinaryTreeUsingArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(0);
        System.out.println();

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(0);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorderTraversal(0);
        System.out.println();
    }
}