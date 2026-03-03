package oops.abstraction.partial;

abstract class Animal {
    abstract void eat();

    void run(){
        System.out.println("running");
    }
}
class lion extends Animal{
    void eat(){
        System.out.println("meat");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("grss");
    }
        }
        class Driver{
    public static void main(String[] args) {
        lion l=new lion();
        l.eat();
        l.run();

        deer d=new deer();
        d.eat();
        d.run();

    }
        }