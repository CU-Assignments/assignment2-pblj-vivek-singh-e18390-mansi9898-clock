import java.util.Scanner;

// Abstract class Person
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}

// Derived class Student
class Student extends Person {
    private int rollNumber;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add Student
        System.out.println("Add Student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Student student = new Student(studentName, studentAge, rollNumber);
        student.displayDetails();

        // Add Teacher
        System.out.println("\nAdd Teacher:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        teacher.displayDetails();

        // Close the scanner
        scanner.close();
    }
}