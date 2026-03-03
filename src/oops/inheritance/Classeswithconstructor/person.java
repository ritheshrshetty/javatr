package oops.inheritance.Classeswithconstructor;

 public class person {
    String Firstname;
    String Lastname;

    person(String Firstname,String Lastname){
        this.Firstname=Firstname;
        this.Lastname=Lastname;

    }
}
class Student extends person{
    int usn;

    Student(String Firstname,String Lastname,int usn){
        super(Firstname,Lastname);
        this.usn=usn;
    }
    void printdetails(){
        System.out.println("s"+Firstname);
        System.out.println("w"+Lastname);
        System.out.println("q"+usn);
   }
}
class Driver{
    public static void main(String[] args) {
        Student s1=new Student("f","r",55);

    }
}