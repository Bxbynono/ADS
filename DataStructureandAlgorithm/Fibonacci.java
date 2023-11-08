// package DataStructureandAlgorithm;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println("Fibonacci series of " + n + "th" + " numbers is:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
}

