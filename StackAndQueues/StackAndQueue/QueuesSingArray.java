package StackAndQueues;
public class QueuesSingArray {
    private int capacity;
    private int[] queueArray;
    private int currentSize;

    QueuesSingArray(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.currentSize = 0;
    }

    void traversal() {
        for (int i = 0; i < capacity; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean isFull() {
        return currentSize == capacity;
    }

    void resize(int cap) {
        capacity = cap + 1;
        int[] temp = new int[capacity];
        for (int i = 0; i < currentSize; i++) {
            temp[i] = queueArray[i];
        }
        queueArray = temp;
    }

    void enqueue(int data) {
        if (isFull()) {
            resize(2 * capacity - 1);
        }
        queueArray[currentSize] = data;
        currentSize++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = queueArray[0];

        for (int i = 0; i < queueArray.length - 1; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        currentSize--;
        if (currentSize == (capacity / 2) - 1) {
            // System.out.println("SIZE: " + currentSize);
            resize(currentSize);
        }
        return data;
    }

    int peek() {
        return queueArray[0];
    }

    void deleteQueue() {
        capacity = 0;
    }

    public static void main(String[] args) {
        QueuesSingArray queue = new QueuesSingArray(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.traversal();
        System.out.println("Peeking: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.traversal();
        queue.dequeue();

        System.out.println("Queue size: " + queue.currentSize);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());

        }
        queue.traversal();
        queue.deleteQueue();
        queue.traversal();
    }
}
