package StackAndQueues;

public class QueuesUsingLinkedList {

    class QueueClass {

        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                next = null;
            }
        }

        class Queue {
            public Node front;
            public Node rear;

            public boolean isEmpty() {
                return front == null;
            }

            public void enqueue(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    front = rear = newNode;
                } else {
                    rear.next = newNode;
                    rear = newNode;
                }
            }

            public int dequeue() {
                if (isEmpty()) {
                    return -1;
                }
                int item = front.data;
                front = front.next;
                return item;
            }

            public int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return front.data;
            }

            public void traverse() {
                Node current = front;
                while (current != null) {
                    System.out.println(current.data);
                    current = current.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        QueuesUsingLinkedList outer = new QueuesUsingLinkedList();
        QueueClass.Queue q = outer.new QueueClass().new Queue();

        q.enqueue(7);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println("Queue elements:");
        q.traverse();

        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.peek());
            q.dequeue();
        }
    }
}
