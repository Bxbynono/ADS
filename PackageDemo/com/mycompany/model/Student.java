package PackageDemo.com.mycompany.model;

public class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void displayStudentInfo() {
        System.out.println("Student_ID: " + studentId);
        System.err.println("Name: " + name);
    }

}
