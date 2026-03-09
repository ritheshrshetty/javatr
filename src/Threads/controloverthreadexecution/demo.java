package Threads.controloverthreadexecution;

class mythread extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("thead is running "+ i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

        }
    }
}
}
 public class demo{
    static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {}
        for (int i = 1; i <=10 ; i++) {
            System.out.println("main thread is running"+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
    }
    }
