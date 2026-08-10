import java.util.ArrayList;
import java.util.Scanner;

public class todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task Added Successfully.");

            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No Tasks Available.");
                } else {
                    StringBuffer sb = new StringBuffer();
                    sb.append("\n----- TO-DO LIST -----\n");

                    for (int i = 0; i < tasks.size(); i++) {
                        sb.append((i + 1) + ". " + tasks.get(i) + "\n");
                    }

                    System.out.println(sb);
                }

            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No Tasks to Remove.");
                } else {
                    System.out.print("Enter Task Number to Remove: ");
                    int n = sc.nextInt();

                    if (n >= 1 && n <= tasks.size()) {
                        tasks.remove(n - 1);
                        System.out.println("Task Removed Successfully.");
                    } else {
                        System.out.println("Invalid Task Number.");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Exiting Program...");

            } else {
                System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}