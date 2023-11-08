// package DataStructureandAlgorithm;
import java.util.Scanner;

public class Second_Fibonacci {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int result = fibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + result);

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
