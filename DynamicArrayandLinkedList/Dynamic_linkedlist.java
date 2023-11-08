package DynamicArrayandLinkedList;

import java.util.Scanner;

public class Dynamic_linkedlist {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;

        LinkedList() {
            head = null;
        }

        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Insertion at a specific position in the linked list
        void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);
            if (position < 1) {
                System.out.println("Invalid position.");
                return;
            }

            if (position == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node current = head;
            int currentPosition = 1;
            while (current != null && currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }

            if (current == null) {
                System.out.println("Invalid position.");
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        // Deletion of a node with a given value
        void delete(int data) {
            if (head == null) {
                System.out.println("Linked list is empty.");
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }

            System.out.println("Element not found in the linked list.");
        }

        // Search for a given value in the linked list
        boolean search(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // Display the linked list
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(40);
        list.insert(50);
        list.insert(90);

        System.out.println("Original Linked List:");
        list.display();

        Scanner input = new Scanner(System.in);

        // Insertion
        System.out.println("Enter Element to Insert: ");
        int insertValue = input.nextInt();
        System.out.println("Enter Position to Insert: ");
        int insertPosition = input.nextInt();
        list.insertAtPosition(insertValue, insertPosition);

        System.out.println("Linked List after inserting " + insertValue + " at position " + insertPosition + ":");
        list.display();

        // Search
        System.out.println("Enter Element to Search: ");
        int valueToSearch = input.nextInt();
        if (list.search(valueToSearch)) {
            System.out.println(valueToSearch + " found in the linked list");
        } else {
            System.out.println(valueToSearch + " not found in the linked list");
        }

        // Deletion
        System.out.println("Enter Element to Delete: ");
        int valueToDelete = input.nextInt();
        list.delete(valueToDelete);
        System.out.println("Linked List after deleting " + valueToDelete + ":");
        list.display();

        input.close();
    }
}
