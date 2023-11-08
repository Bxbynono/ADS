// package DataStructureandAlgorithm;

import java.util.Scanner;

public class Recursion_factorial {
    public static int calculateFactorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*calculateFactorial( n- 1);  
            // Recursive call
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = scanner.nextInt();
    int factorial = calculateFactorial(n);
    System.out.println("Factorial of" +" " + n + ":" + " " + factorial);
    scanner.close();
        
    }
    
}
