class Course {     String courseName;     int semester;     int marks; 
 
    public Course(String courseName, int semester, int marks) {         this.courseName = courseName;         this.semester = semester;         this.marks = marks; 
    } 
 
    public void displayCourse() { 
        System.out.println("Semester " + semester + ": " + courseName + " - " + marks + " marks"); 
    } 
} 
 
public class StudentCourses {     public static void main(String[] args) {         Course[] courses = {             new Course("Maths", 1, 85),             new Course("Physics", 1, 72),             new Course("Data Structures", 2, 90),             new Course("Java", 2, 88) 
        }; 
 
        System.out.println("== Course List ==");         for (Course c : courses) {             c.displayCourse(); 
        } 
    } 
} 
