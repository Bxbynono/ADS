package Linkedlist;
class Node{
    String name;
    Node next;
    Node(String name){
        this.name=name;
        next = null;
    }
}
class List{
    Node head,tail;

    List(){
        head = null;
        tail = null;
    }
    void insertion(String element){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
}

public class Implementation {
    public static void main(String[] args) {
        System.out.println();
    }
}
