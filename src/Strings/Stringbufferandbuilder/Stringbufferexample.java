package Strings.Stringbufferandbuilder;

public class Stringbufferexample {
    static void stringappend(){
        StringBuffer sbf=new StringBuffer("hello");
        System.out.println("original is:"+ sbf);
        sbf.append("world");
        System.out.println("new :"+ sbf);
    }
    static void stringinsert(){
        StringBuffer sbf=new StringBuffer("hello");
        System.out.println("original is:"+ sbf);
        sbf.insert(2,"world");
        System.out.println("new :"+ sbf);
    }
    static void stringrevese(){
        StringBuffer sbf=new StringBuffer("hello");
        System.out.println("original is:"+ sbf);
        sbf.reverse();
        System.out.println("new :"+ sbf);
    }

    static void main(String[] args) {
        stringappend();
        stringinsert();
        stringrevese();
    }
}
