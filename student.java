
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private LocalDate dateOfBirth;

    public Student(String name, String dateOfBirth) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        LocalDate currentDate = LocalDate.now();
        long age = ChronoUnit.YEARS.between(this.dateOfBirth, currentDate);
        System.out.println("Age of Student is: " + age + " Years");
    }
     public static void main(String[] args) {
        Student stu = new Student("Hazra", "2003-12-04");
        stu.displayAge();
        stu.displayStudentName();

        StudentCourses studentCourses = new StudentCourses();
        // Add some courses and marks
        studentCourses.addCourse("Java", 80);
        studentCourses.addCourse("Data Structures", 85);
        studentCourses.addCourse("Operating Systems", 70);
        // Display the courses and marks
        studentCourses.displayCourses();
    }
}


class StudentCourses {
    private Map<String, Integer> courses;

    public StudentCourses() {
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    public void displayCourses() {
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

