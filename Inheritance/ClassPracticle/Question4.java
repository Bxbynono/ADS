package Inheritance.ClassPracticle;
public class Question4 {
    public static void main(String[] args) {
        Power powerCalculator = new Power();

        int a = 2;
        int b = 3;
        powerCalculator.powerOfNumbers(a, b);

        float floatBase = 2.5f;
        powerCalculator.powerOfNumbers(floatBase, b);
    }
}

class Power {
    void powerOfNumbers(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        System.out.println("The power is: " + result);
    }

    void powerOfNumbers(float a, int b) {
        float result = 1.0f;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        System.out.println("The power is: " + result);
    }
}
class Demo1 extends Power{
    
}


