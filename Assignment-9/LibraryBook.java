class Book {
    final String ISBN;
    String title;
    String author;
    double price;
    Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Book book = new Book(
            "978-0135166307",
            "Effective Java",
            "Joshua Bloch",
            750
        );
        book.displayBook();
        // book.ISBN = "123-456789"; 
        // Error: cannot change the value of a final variable
    }
}