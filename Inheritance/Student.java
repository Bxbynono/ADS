package Inheritance;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Chogyel", 21);
        student1.introduce();
    }
}

class Child {
    String name;
    int age;

    Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        Child child1 = new Child("Alice", 5);
        child1.introduce();
    }
}
