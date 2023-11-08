package Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("Running");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Woof");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  
        dog.run();  
        dog.bark(); 
    }
}
