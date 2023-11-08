package Practicle_1d;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[numNames];

        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sorting the array of names in alphabetical order
        Arrays.sort(names);

        System.out.println("Sorted names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

}
