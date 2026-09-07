import faculty.Faculty;
import student.Student;
public class CollegeManagement{
    public static void main(String[] args){
        Student s=new Student();
        Faculty f=new Faculty();
        System.out.println("Student Details:");
        s.display();
        System.out.println("\nFaculty Details:");
        f.display();
    }
}