package Practicle_1d;

import java.util.Scanner;

public class Question7 {
    public static String removeVowels(String sentence) {
        return sentence.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence (not more than 80 characters): ");
        String inputSentence = scanner.nextLine();

        if (inputSentence.length() > 80) {
            System.out.println("The sentence is too long. Please enter a sentence with 80 or fewer characters.");
        } else {
            String sentenceWithoutVowels = removeVowels(inputSentence);
            System.out.println("Sentence without vowels: " + sentenceWithoutVowels);
        }

        scanner.close();
    }
}