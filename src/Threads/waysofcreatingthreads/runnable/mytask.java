package Threads.waysofcreatingthreads.runnable;

public class mytask implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("thread is running..");

        }
    }
}
class demo{
    static void main(String[] args) {
        mytask obj=new mytask();
        Thread t1=new Thread();
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main is running..");

        }
    }
}