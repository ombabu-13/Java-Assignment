interface animal {
    void eat();
    void sleep();
}
class dog implements animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
public class interface_EX {
    public static void main(String args[]) {
        dog d = new dog();
        d.eat();
        d.sleep();
    }
}