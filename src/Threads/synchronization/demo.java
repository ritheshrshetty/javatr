package Threads.synchronization;
class counter {
    static int count=0;
    synchronized static void increment(){
        count++;
    }
}
class mythread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.increment();

        }
    }
}
public class demo{
    static void main(String[] args) {
        mythread t1=new mythread();
        mythread t2=new mythread();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){}
        System.out.println("Final count:"+ counter.count);
}
}