package oops.bascis.classwithattrbutes;

public class student {
    String name;
    int usn;
    student(String name,int usn){
        this.name=name;
        this.usn=usn;

    }
    void printdetails(){
        System.out.println("student name" + name);
        System.out.println("student usn" + usn);
    }
}
class driver{
    public static void main(String[] args) {
        student s1=new student("rithesh",123);
        student s2=new student("shetty",456);
        s1.printdetails();
        s2.printdetails();
    }
}
