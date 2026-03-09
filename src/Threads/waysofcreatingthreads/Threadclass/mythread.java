package Threads.waysofcreatingthreads.Threadclass;

public class mythread extends Thread {
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("thread is running..");

        }
    }
}
class demo{
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread is running..");

        }
    }
}