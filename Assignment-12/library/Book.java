package library;
public class Book{
    int bookId=101;
    String title="Effective Java";
    String author="Joshua Bloch";
    double price=750;
    public void display(){
        System.out.println("Book ID: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: ₹"+price);
    }
}