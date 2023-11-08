package Object;

public class Course {
    String courseCode;
    String courseName;
    String tutor;

    Course(String code, String name, String lr) {
        courseCode = code;
        courseName = name;
        tutor = lr;
    }

    void addCourse(String code, String name) {
        courseCode = code;
        courseName = name;
        System.out.println("Course added: " + courseCode + " - " + courseName);
    }

    void setLecturer(String tr) {
        tutor = tr;
        System.out.println(courseName + " " + tutor);
    }

    public static void main(String[] args) {
        Course course1 = new Course("MAT301", "Mathematics", "Chimi");
        course1.addCourse("PHY201", "Physics");

        course1.setLecturer("Jigme Namgyel");
        System.out.println("Course Code: " + course1.courseCode);
        System.out.println("Course Name: " + course1.courseName);
        System.out.println("Tutor: " + course1.tutor);
    }
}
