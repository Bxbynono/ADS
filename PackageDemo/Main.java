package PackageDemo;

// import PackageDemo.com.mycompany.model.Student;
import PackageDemo.com.mycompany.util.StringUtil;

public class Main {
    public static void main(String[] args) {
        // Student student1 = new Student(123, "Tshering");

        // student1.name;
        // student1.studentId;

        // student1.displayStudentInfo();

        String original = "Hello";

        // Use the reverseString method from StringUtils class
        String reversed = StringUtil.reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
