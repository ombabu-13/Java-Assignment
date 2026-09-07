interface P1{
    void display();
}
interface P2{
    void show();
}
class A implements P1, P2{
    public void display(){
        System.out.println("Display method of interface P1");
    }
    public void show(){
        System.out.println("Show method of interface P2");
    }
}
public class multiintr{
    public static void main(String args[]){
        A obj = new A();
        obj.display();
        obj.show();
    }
}