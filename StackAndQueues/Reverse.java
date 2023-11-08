package StackAndQueues;


class CharNode {
    char data;
    CharNode next;

    CharNode(char data) {
        this.data = data;
        next = null;
    }

    public String toString() {
        return String.valueOf(data);
    }
}

public class Reverse {
    CharNode top;
    int size;

    Reverse() {
        top = null;
        size = 0;
    }

    void push(char data) {
        CharNode node = new CharNode(data);
        node.next = top;
        top = node;
        size++;
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void traversal() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(top.data + " ");
            top = top.next;
        }
        System.out.println();
    }
     public static String reverseString(String input) {
        Reverse stack = new Reverse();
        for (char ch : input.toCharArray()) {
            System.out.println(ch);
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        stack.traversal();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            reversed.append(ch);
        } 
        return reversed.toString();
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        String input = "Hello";
        for (char ch : input.toCharArray()) {
            System.out.print(ch);
            obj.push(ch);
        }
        System.out.println();
        obj.traversal();
        while (!obj.isEmpty()) {
            System.out.print((obj.pop()));
        }

    }

   
}