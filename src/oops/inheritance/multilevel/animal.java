package oops.inheritance.multilevel;
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
class puppy extends dog{
    void sleep(){
        System.out.println(("sleep"));
    }
}
class Driver{
    public static void main(String[] args) {
        animal a=new animal();
        a.eat();

        dog d=new dog();
        d.bark();
        d.eat();

        puppy p=new puppy();
        p.sleep();
        p.bark();
        p.eat();
    }
}