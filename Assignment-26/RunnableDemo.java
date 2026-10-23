class NumberTask implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class RunnableDemo{
    public static void main(String[] args){
        NumberTask task=new NumberTask();
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}