import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        String mark1 = sc.nextLine();

        System.out.print("Enter marks in Subject 2: ");
        String mark2 = sc.nextLine();

        System.out.print("Enter marks in Subject 3: ");
        String mark3 = sc.nextLine();

        int m1 = Integer.parseInt(mark1);
        int m2 = Integer.parseInt(mark2);
        int m3 = Integer.parseInt(mark3);

        int total = m1 + m2 + m3;

        System.out.println("Total Marks = " + total);

        sc.close();
    }
}
    

