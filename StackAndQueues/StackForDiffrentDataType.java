package StackAndQueues;

public class StackForDiffrentDataType<Item> {

    public static class Node<Item> {
        Item data;
        Node<Item> next;

        Node(Item data) {
            this.data = data;
            next = null;
        }
    }

    private Node<Item> front;
    private Node<Item> rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Item data) {
        Node<Item> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Item dequeue() {
        if (isEmpty()) {
            return null; // Return null when the queue is empty (instead of -1)
        }
        Item item = front.data;
        front = front.next;
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            return null; // Return null when the queue is empty (instead of -1)
        }
        return front.data;
    }

    public void traverse() {
        Node<Item> current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackForDiffrentDataType<Object> q = new StackForDiffrentDataType<>();

        q.enqueue(7);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue("Hello");

        System.out.println("Queue elements:");
        q.traverse();

        while (!q.isEmpty()) {
            Object dequeued = q.dequeue();
            if (dequeued != null) {
                System.out.println("Dequeued: " + dequeued);
            } else {
                System.out.println("Queue is empty.");
            }
        }
    }
}
