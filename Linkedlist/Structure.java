package Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Linkedlist {
    Node head, tail;

    Linkedlist() {
        head = null;
        tail = null;
    }

    void insertion(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertionAtEnd(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

}

public class Structure {
    public static void main(String[] args) {
        Linkedlist obj = new Linkedlist();
        System.out.println("Begining:");
        obj.insertion(4);
        obj.insertion(5);
        obj.insertion(6);
        obj.insertion(7);
        obj.insertion(8);
        obj.insertion(9);
        System.out.println(obj.head.data);
        System.out.println("End:");
        obj.insertionAtEnd(4);
        obj.insertion(5);
        obj.insertionAtEnd(6);
        obj.insertionAtEnd(7);
        obj.insertionAtEnd(8);
        obj.insertionAtEnd(14);
        System.out.println(obj.tail.data);
        

    }
}
