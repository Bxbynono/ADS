package StackAndQueues;

import java.io.*;

public class Query {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    class Queue {
        Node front;
        Node rear;

        boolean isEmpty() {
            return front == null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        int dequeue() {
            if (isEmpty()) {
                return -1;
            }
            int item = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return item;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return front.data;
        }
    }

    public static void main(String[] args) throws IOException {
        String filePath = "D:/ADS(CSA201)/StackAndQueues/SampleInput.txt";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Queue queue = new Query().new Queue();

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                int queryType = Integer.parseInt(parts[0]);

                if (queryType == 1) {
                    int x = Integer.parseInt(parts[1]);
                    queue.enqueue(x);
                } else if (queryType == 2) {
                    queue.dequeue();
                } else if (queryType == 3) {
                    int frontValue = queue.peek();
                    System.out.println(frontValue);
                } else {
                    System.out.println();
                }
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
