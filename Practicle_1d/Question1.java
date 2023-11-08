package Practicle_1d;

public class Question1 {
    float Product(float a, int b) {
        float product = a * b;
        return product;
    }
    
    public static void main(String[] args) {
        float floatNumber = 3.5f;
        int intNumber = 5;

        Question1 calculator = new Question1();
        float result = calculator.Product(floatNumber, intNumber);
        System.out.println("product: " + result);
    }
}
