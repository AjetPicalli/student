import java.util.ArrayList;
import java.util.List;

public class Student{


public String name;
public int id;
public List<Course> courses;

// Constructor
public Student(String name, int id) {
    this.name = name;
    this.id = id;
    this.courses = new ArrayList<>();
}

// Method to enroll in a course
public void enroll(Course course) {
    courses.add(course);           // Add the course to the student's list
    course.addStudent(this);       // Add this student to the course's student list
}

// Method to list all enrolled courses
public void listCourses() {
    System.out.println(name + " is enrolled in the following courses:");
    for (Course course : courses) {
        System.out.println(course.courseName); // Accessing public field directly
    }
}
}