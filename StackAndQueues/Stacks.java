package StackAndQueues;

public class Stacks {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class StackOfInteger {
        Node first;
        int size;

        StackOfInteger() {
            first = null;
            size = 0;
        }

        boolean isEmpty() {
            return first == null;
        }

        void push(int element) {
            Node newNode = new Node(element);
            if (isEmpty()) {
                first = newNode;
            } else {
                newNode.next = first;
                first = newNode;
            }
            size++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            } else {
                int poppedValue = first.data;
                first = first.next;
                size--;
                return poppedValue;
            }
        }

        void traverse() {
            Node current = first;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        StackOfInteger stackOfInteger = stack.new StackOfInteger();

        System.out.println(stackOfInteger.isEmpty());

        stackOfInteger.push(2);
        stackOfInteger.push(4);
        stackOfInteger.push(6);
        stackOfInteger.push(8);
        stackOfInteger.push(10);
        stackOfInteger.push(12);

        int poppedValue1 = stackOfInteger.pop();
        System.out.println("Popped values: " + poppedValue1);

        System.out.println("Updated Stack elements:");
        stackOfInteger.traverse();
    }
}
