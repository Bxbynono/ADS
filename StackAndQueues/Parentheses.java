package StackAndQueues;
import java.util.Scanner;

class ParenthesesNode {
    char data;
    ParenthesesNode next;

    ParenthesesNode(char data) {
        this.data = data;
        next = null;
    }
}

public class Parentheses {
    ParenthesesNode top;
    int size;

    Parentheses() {
        top = null;
        size = 0;
    }

    void push(char data) {
        ParenthesesNode node = new ParenthesesNode(data);
        node.next = top;
        top = node;
        size++;
    }

    char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
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
            System.out.print(top.data);
            top = top.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parentheses stack = new Parentheses();
        System.out.print("Enter a string of parentheses, square brackets, and curly braces: ");
        String input = scanner.nextLine();
        scanner.close();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced!");
                    return;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    System.out.println("Not Balanced!");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced!");

    }

    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }
}