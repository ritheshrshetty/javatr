package oops.abstraction.complete;

public interface Animal {
    void eat();
    void run();
}
class dog implements Animal{
    public void eat() {
        System.out.println("eating");

    }
    public void run(){
        System.out.println("running");
    }
}
class Driver{
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.run();

    }
    }
