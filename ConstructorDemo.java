class Student {

    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
    }

    // Parameterized Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Copy Constructor
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
        marks = s.marks;
    }

    // Display Method
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println();
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        // Default Constructor
        Student s1 = new Student();

        // Parameterized Constructor
        Student s2 = new Student(101, "Rahul", 89.5);

        // Copy Constructor
        Student s3 = new Student(s2);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("Parameterized Constructor:");
        s2.display();

        System.out.println("Copy Constructor:");
        s3.display();
    }
}