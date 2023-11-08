package Practicle_1d;

import java.util.Scanner;

public class Question5 {
    public static String extractSubstring(String inputString, int startPosition, int numCharacters) {
        if (numCharacters == 0) {
            return inputString.substring(startPosition);
        } else {
            int endPosition = Math.min(startPosition + numCharacters, inputString.length());
            return inputString.substring(startPosition, endPosition);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the start position: ");
        int startPosition = scanner.nextInt();

        System.out.print("Enter the number of characters to extract: ");
        int numCharacters = scanner.nextInt();

        String extractedSubstring = extractSubstring(inputString, startPosition, numCharacters);
        System.out.println("Extracted substring: " + extractedSubstring);

        scanner.close();
    }
}

