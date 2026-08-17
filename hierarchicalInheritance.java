class animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking...");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class hierarchicalInheritance {
    public static void main(String args[]){
        dog d=new dog();
        d.bark();
        d.eat();
        
        cat c=new cat();
        c.meow();
        c.eat();
    }
}