package Inheritance.Practicle2a;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gear for Bicycle: ");
        int bicycleGear = scanner.nextInt();

        System.out.print("Enter speed for Bicycle: ");
        int bicycleSpeed = scanner.nextInt();

        Bicycle bicycle = new Bicycle(bicycleGear, bicycleSpeed);

        System.out.print("Enter gear for MountainBike: ");
        int mountainBikeGear = scanner.nextInt();

        System.out.print("Enter speed for MountainBike: ");
        int mountainBikeSpeed = scanner.nextInt();

        System.out.print("Enter seat height for MountainBike: ");
        int mountainBikeSeatHeight = scanner.nextInt();

        MountainBike mountainBike = new MountainBike(mountainBikeGear, mountainBikeSpeed, mountainBikeSeatHeight);

        System.out.println("\nBicycle Info: " + bicycle);
        System.out.println("MountainBike Info: " + mountainBike);

        scanner.close();
    }
}

class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    public String toString() {
        return "gear: " + gear + ", speed: " + speed;
    }
}

class MountainBike extends Bicycle {
    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    void setSeatHeight(int height) {
        seatHeight = height;
    }

    public String toString() {
        return "MountainBike - gear: " + gear + ", speed: " + speed + ", seatHeight: " + seatHeight;
    }
}
