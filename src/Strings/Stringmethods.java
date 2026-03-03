package Strings;

public class Stringmethods {
    static void main(String[] args) {
        String s1="Java Progamming";
        String s2=new String("Java Progamming");

        System.out.println("original String:"+s1);

        //length()
        System.out.println("length "+ s1.length());

        //charAt()
        System.out.println("character at index 2:"+ s1.charAt(2));

        //to upper case() & to lower case()
        System.out.println("uppercase"+ s1.toUpperCase());
        System.out.println("lowercase"+ s1.toLowerCase());

        //equals() and ==
        System.out.println("using ==:"+(s1==s2));//match address
        System.out.println("using equals:"+s1.equals(s2));//match string

        //compareto() -> lexicographical comparision
        System.out.println("compareto():"+ s1.compareTo(s2));//ASCII value is compared

        //substring()
        System.out.println("Substring 0 to 4 :"+ s1.substring(0,7));

        //contain()
        System.out.println("contains 'Progam':"+s1.contains("Progam"));

        //indexof()
        System.out.println("index of a"+ s1.indexOf("a"));

        //replace()
        System.out.println("replace java to python"+s1.replace("Java","python"));

        //trip()
        String s3="     hello world      ";
        System.out.println("before"+s3);
        System.out.println("after"+s3.trim());

        //concat()
        System.out.println("concat:"+s1.concat("Language"));

        //isempty()
        String s4="";
        System.out.println("is empty:"+s4.isEmpty());

        //split()
        String sentence="Java is a Progamming Language";
        String[] arr=sentence.split(" ");
        for (String i:arr) {
            System.out.println(i);

        }


    }
}
