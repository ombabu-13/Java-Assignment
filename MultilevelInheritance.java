class grandparent {
    void display() {
        System.out.println("This is grandparent class");
    }
}
class parent extends grandparent {
    void show() {
        System.out.println("This is parent class");
    }
}
class child extends parent {
    void print() {
        System.out.println("This is child class");
    }
}
class MultilevelInheritance {
    public static void main(String args[]) {
        child c = new child();
        c.print();
        c.show();
        c.display();
    }
}