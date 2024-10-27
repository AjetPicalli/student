
public class Main{

   public  static void main(String[] args) {
       Student student1 = new Student("Orges", 01);
       Student student2 = new Student("Orgesa", 02);
       Student student3 = new Student("Ajet", 03);

// Create courses
 Course course1 = new Course("Math", "MATH101");
 Course course2 = new Course("Computer ", "CS101");
 Course course3 = new Course("Music","MU101");

// Students enroll in courses
student1.enroll(course2);
student1.enroll(course2);
student2.enroll(course2);
student3.enroll(course2);
student1.enroll(course3);

// List the courses each student is enrolled in
student1.listCourses();
student2.listCourses();
student3.listCourses();

// List the students in each course
course1.listStudents();
course2.listStudents();
course3.listStudents();


       System.out.println(course1.students.size());
       System.out.println(course2.students.size());
       System.out.println(student1.courses.size());



   }

}
