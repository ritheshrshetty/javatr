package oops.inheritance.hierrachial;
public class animal {
    void eat(){
        System.out.println("eating..");
    }
}
class dog extends animal {
    void bark(){
        System.out.println("barking..");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meow..");
    }
}
class Driver{
    public static void main(String[] args) {
        animal a=new animal();
        a.eat();

        dog d=new dog();
        d.bark();
        d.eat();

        cat c=new cat();
        c.meow();
        c.eat();

    }
}