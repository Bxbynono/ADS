package StackAndQueues;

class QueueUsingArray {
    int q[];
    int front;
    int rear;
    int size;

    QueueUsingArray() {
        q = new int[4];
        front = 0;
        rear = -1;
        size = 0;
    }

    void resize(int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = q[(front + i) % q.length];
        }
        q = temp;
        front = 0;
        rear = size - 1;
    }

    void enqueue(int element) {
        if (size == q.length) {
            resize(q.length * 2);
        }
        rear = (rear + 1) % q.length;
        q[rear] = element;
        size++;
    }

    void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.println(q[(front + i) % q.length]);
        }
    }

    int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = q[front];
        q[front] = 0;
        front = (front + 1) % q.length;
        size--;
        if (size > 0 && size == q.length / 4) {
            resize(q.length / 2);
        }
        return value;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean search(int val) {
        for (int i = 0; i < size; i++) {
            if (q[(front + i) % q.length] == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue empty: " + queue.isEmpty());
        System.out.println("The value is in the array: " + queue.search(6));
        queue.traverse();
    }
}