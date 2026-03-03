package Strings.Stringbufferandbuilder;

public class Stringbuilderexample {
        static void stringappend(){
            StringBuilder sbf=new StringBuilder("hello");
            System.out.println("original is:"+ sbf);
            sbf.append("world");
            System.out.println("new :"+ sbf);
        }
        static void stringinsert(){
            StringBuilder sbf=new StringBuilder("hello");
            System.out.println("original is:"+ sbf);
            sbf.insert(2,"world");
            System.out.println("new :"+ sbf);
        }
        static void stringrevese(){
            StringBuilder sbf=new StringBuilder("hello");
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
