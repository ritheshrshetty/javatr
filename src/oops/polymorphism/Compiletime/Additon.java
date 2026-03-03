package oops.polymorphism.Compiletime;
//compile time polymorphism-overloading
public class Additon {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class Driver{
    public static void main(String[] args) {
        Additon obj=new Additon();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}