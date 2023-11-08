package Practicle_1d;
import java.util.Scanner;


public class Question4 {
     public static String[] replaceSubstring(String[] arr, String str1, String str2) {
            String[] modifiedArr = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains(str1)) {
                    modifiedArr[i] = arr[i].replace(str1, str2);
                } else {
                    modifiedArr[i] = arr[i];
                }
            }
            return modifiedArr;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of strings: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String[] strArr = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                strArr[i] = scanner.nextLine();
            }

            System.out.print("Enter the substring to replace: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the replacement substring: ");
            String str2 = scanner.nextLine();

            String[] modifiedStrArr = replaceSubstring(strArr, str1, str2);

            System.out.println("Original array of strings:");
            for (String str : strArr) {
                System.out.println(str);
            }

            System.out.println("Modified array of strings:");
            for (String str : modifiedStrArr) {
                System.out.println(str);
            }

            scanner.close();
        }
    }