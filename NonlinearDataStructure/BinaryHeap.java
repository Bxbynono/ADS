public class BinaryHeap {

    int[] heaparr = new int[7];
    int size = 0;

    public int getSize() {
        return size;
    }

    void insert(int ele) {
        if (size == 7)
            return;
        else {
            heaparr[++size] = ele;
        }
    }

    void peek() {
        System.out.println(" " + heaparr[1]);
    }

    void traversal() {
        for (int i = 1; i <= size; i++) {
            System.out.print(" " + heaparr[i]);
        }
    }

    void delete(int i) {
        if (size < i) {
            System.out.println("Invalid index.");
            return;
        }

        heaparr[i] = heaparr[size];
        size--;

        maxheapify(i);
    }

    void maxheapify(int i) {
        int largest = i;
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;

        if (leftChild <= size && heaparr[leftChild] > heaparr[largest]) {
            largest = leftChild;
        }

        if (rightChild <= size && heaparr[rightChild] > heaparr[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int temp = heaparr[i];
            heaparr[i] = heaparr[largest];
            heaparr[largest] = temp;

            maxheapify(largest);
        }
    }
 
    // void minheapify(int i) {
    // int smallest = i;
    // int leftChild = 2 * i;
    // int rightChild = 2 * i + 1;

    // if (leftChild <= size && heaparr[leftChild] < heaparr[smallest]) {
    // smallest = leftChild;
    // }

    // if (rightChild <= size && heaparr[rightChild] < heaparr[smallest]) {
    // smallest = rightChild;
    // }

    // if (smallest != i) {
    // int temp = heaparr[i];
    // heaparr[i] = heaparr[smallest];
    // heaparr[smallest] = temp;

    // minheapify(smallest);
    // }
    // }

    public static void main(String[] args) {
        BinaryHeap obj = new BinaryHeap();

        obj.insert(23);
        obj.insert(20);
        obj.insert(13);
        obj.insert(10);
        obj.insert(9);
        obj.insert(21);

        System.out.print("The peeked value/the root node:");
        obj.peek();

        System.out.println();

        System.out.print("level order treversal:");
        obj.traversal();

        System.out.println();

        // obj.maxheapify(3);

        // System.out.print("level order treversal after maxheapify:");
        // obj.traversal();

        System.out.println();

        System.out.print("Size of the BinaryHeap is: " + obj.size);

        System.out.println();

        obj.delete(1);
        System.out.print("level order treversal after deletion:");
        obj.traversal();

        System.out.println();

        System.out.print("Size of the BinaryHeap is after deletion: " + obj.size);
    }
}