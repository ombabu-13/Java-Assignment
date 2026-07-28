import java.util.ArrayList;
import java.util.Scanner;

public class studentCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== Student Course Registration =====");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Course Name: ");
                String course = sc.nextLine();
                courses.add(course);
                System.out.println("Course Registered Successfully.");

            } else if (choice == 2) {

                if (courses.isEmpty()) {
                    System.out.println("No Courses Registered.");
                } else {
                    System.out.print("Enter Course Number to Remove: ");
                    int num = sc.nextInt();

                    if (num >= 1 && num <= courses.size()) {
                        courses.remove(num - 1);
                        System.out.println("Course Removed Successfully.");
                    } else {
                        System.out.println("Invalid Course Number.");
                    }
                }

            } else if (choice == 3) {

                if (courses.isEmpty()) {
                    System.out.println("No Courses Registered.");
                } else {
                    StringBuffer sb = new StringBuffer();
                    sb.append("\nRegistered Courses:\n");

                    for (int i = 0; i < courses.size(); i++) {
                        sb.append((i + 1) + ". " + courses.get(i) + "\n");
                    }

                    System.out.println(sb);
                }

            } else if (choice == 4) {
                System.out.println("Thank You!");

            } else {
                System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}