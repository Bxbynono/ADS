public class IterativeTree {
    TreeNode root;
    boolean checkRight;

    IterativeTree() {
        root = null;
        checkRight = false;
    }

    void add(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        if (root.left == null) {
            root.left = newNode;
            return;
        }
        if (root.right == null) {
            root.right = newNode;
            return;
        }
        if (checkRight) {
            TreeNode r = root;
            while (r.right != null) {
                if (r.left == null) {
                    r.left = newNode;
                    return;
                }
                r = r.right;
            }
            r.right = newNode;
        } else {
            TreeNode n = root;
            while (n.left != null) {
                if (n.right == null) {
                    n.right = newNode;
                    checkRight = true;
                    return;
                }
                n = n.left;
            }
            n.left = newNode;
        }
    }

    void inOrderTraversal() {
        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                TreeNode parent = current.left;
                while (parent.right != null && parent.right != current) {
                    parent = parent.right;
                }
                if (parent.right == null) {
                    parent.right = current;
                    current = current.left;
                } else {
                    parent.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }


    public static void main(String[] args) {
        IterativeTree object = new IterativeTree();
        object.add(1);
        object.add(2);
        object.add(3);
        object.add(4);
        object.add(5);
        object.add(6);
        System.out.print("Inorder Traversal:");
        object.inOrderTraversal();
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}
