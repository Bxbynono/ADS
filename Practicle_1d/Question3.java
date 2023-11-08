package Practicle_1d;
import java.util.Scanner;

public class Question3 {

    int calculatePerimeter(int width, int length) {
        int perimeter = 2 * (width + length);
        return perimeter;
    }

    int calculateArea(int width, int length) {
        int area = width * length;
        return area;
    }

    public static void main(String[] args) {
        Question3 dimensionCalculator = new Question3(); 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        int width = scanner.nextInt();
        System.out.print("Length: ");
        int length = scanner.nextInt();

        scanner.close();

        int perimeter = dimensionCalculator.calculatePerimeter(width, length);
        int area = dimensionCalculator.calculateArea(width, length);
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
