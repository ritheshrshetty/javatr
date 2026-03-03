package Strings;

public class Stringimmutable {
    static void main(String[] args) {
        String s1="hello";
        s1.concat("world");
        System.out.println(s1);
        String s2= s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        String s3=s1 + s2 + "bye";
        System.out.println(s3);
        String s4="helloworld";
        System.out.println(s2==s4);
        System.out.println(s4);
        String s5="helloworld";
        System.out.println(s4==s5);
    }
}
