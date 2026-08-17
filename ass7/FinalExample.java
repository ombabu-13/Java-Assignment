class Parent{
    final void display(){
        System.out.println(" final Parent class Method");
    }
}
class Child extends Parent{
    void display(String s){
        super.display();
        System.out.println("Child class Method");
    }
}
public class FinalExample{
    public static void main(String args[]){
        Child c = new Child("hello");
        c.display();
    }
}