class MyThreadExample extends Thread{
    public void run(){
        String str = "Thread started Running....";
        System.out.println(str);
    }
}
public class MyThread{
    public static void main (String args[]){
        MyThreadExample t1 = new MyThreadExample();
        t1.start();
    }
}
