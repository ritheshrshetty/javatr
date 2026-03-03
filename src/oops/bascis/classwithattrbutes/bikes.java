package oops.bascis.classwithattrbutes;

public class bikes {
    String name;
    int model;
    bikes(String name,int model){//constructor
        this.name=name;
        this.model=model;
    }
     void printdetail(){//function
        System.out.println("name  "  +   name);
        System.out.println("no  "  +   model);
     }
}
class driver1{
    public static void main() {
    bikes b1=new bikes("rx",1995);
    bikes b2=new bikes("xpluse",2025);
    b1.printdetail();
    b2.printdetail();
    }
}
class driver2{
    public static void main() {
        student s1=new student("rithu",89);
        student s2=new student("some",107);
        ;
    }
}