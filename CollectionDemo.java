import java.util.ArrayList;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> students = new ArrayList<>();

        students.add("Om");
        students.add("luffy");
        students.add("rimuru");

        System.out.println("ArrayList:");
        for (String name : students) {
            System.out.println(name);
        }

        // Remove an element
        students.remove("luffy");
        System.out.println("\nAfter removing luffy:");
        System.out.println(students);

        // Vector Example
        Vector<Integer> marks = new Vector<>();

        marks.add(85);
        marks.add(90);
        marks.add(78);

        System.out.println("\nVector:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Add another mark
        marks.add(95);
        System.out.println("\nUpdated Vector:");
        System.out.println(marks);

        // StringBuffer Example
        StringBuffer message = new StringBuffer("Java");

        message.append(" Collections");
        message.append(" Demo");

        System.out.println("\nStringBuffer:");
        System.out.println(message);

        // Insert text
        message.insert(5, "Programming ");
        System.out.println("After Insert:");
        System.out.println(message);

        // Replace text
        message.replace(0, 4, "Core");
        System.out.println("After Replace:");
        System.out.println(message);

        // Reverse string
        message.reverse();
        System.out.println("After Reverse:");
        System.out.println(message);
    }
}