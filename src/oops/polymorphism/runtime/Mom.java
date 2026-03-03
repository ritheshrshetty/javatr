package oops.polymorphism.runtime;

public class Mom {
    void cook(){
        System.out.println("indian");
    }
}
class daughter extends Mom{
    void cook(){
        System.out.println("chinese");
    }
}
class  Driver{
    public static void main(String[] args) {
        Mom m=new Mom();
        daughter d=new daughter();

        m.cook();
        d.cook();
    }
}