package Practicle_1d;

public class Question2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 10;

        question2(x, y, z);

        System.out.println("After circular shift:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }

    public static void question2(int x, int y, int z) {
        x = x + y + z; 
        y = x - y - z;
        z = x - y - z;
        x = x - y - z; 
    }
}
