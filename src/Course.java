import java.util.ArrayList;
import java.util.List;

public class Course {
    public String courseName;
    public String courseCode;
    public List<Student> students;

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }

    // Method to add a student to this course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to list all students in the course
    public void listStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.name); // Accessing public field directly
        }
    }
}

