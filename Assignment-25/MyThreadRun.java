class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class MyThreadRun {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}