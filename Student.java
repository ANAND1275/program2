import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dobStr) {
        this.name = name;
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            this.dob = LocalDate.parse(dobStr, formatter1);
        } catch (DateTimeParseException e) {
            this.dob = LocalDate.parse(dobStr, formatter2);
        }
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        Period age = Period.between(dob, LocalDate.now());
        System.out.println("Age: " + age.getYears() + " years");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", "2004-08-15"); // yyyy-MM-dd format
        s1.displayInfo();

        Student s2 = new Student("Bob", "15-08-2004");   // dd-MM-yyyy format
        s2.displayInfo();
    }
}
