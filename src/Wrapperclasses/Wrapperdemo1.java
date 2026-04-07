package Wrapperclasses;

public class Wrapperdemo1 {//primitive ---->object conversion=boxing
    static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);//mannual boxing
        System.out.println("primitive val: "+x);
        System.out.println("object val "+obj);
    }
}
