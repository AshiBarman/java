class MyRunnable implements java.lang.Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}
public class RunnableQ {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block   t1.join is used to block the main thread.
            e.printStackTrace();
        }
        for(int i =1;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("Main thread is running");
    }
}
