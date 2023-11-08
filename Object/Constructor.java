package Object;

public class Constructor {
    public static void main(String[] args) {

        Student student1 = new Student("Dorji", 20);
        System.out.println(student1.name + " " + student1.age);

    }
}

class Student {
    String name;
    int age;
    
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void enroll(String courseName) {
        System.out.println("Enrolled in the: " + courseName);
    }
}
