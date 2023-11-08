// package DataStructureandAlgorithm;

import java.util.Scanner;

public class Fibonacci_recursion {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter any num: " );
        int n = input.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci of" +" "+ n +"th" +" "+"position: " + result);
        input.close();
    }
}
