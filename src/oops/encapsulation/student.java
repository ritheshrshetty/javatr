package oops.encapsulation;

public class student {
    private String name;//instance variable//
    private int usn;
    static  String college;

    student(String name,int u){
        this.name=name;
        usn=1;
        college="sapthagiri";

    }
    String getname(){
        return name;
    }
    int getusn(){
        return usn;
    }
    void setname(String n){
        name=n;
    }
    void setusn(int usn){
        this.usn=usn;
    }
    void printDetails(){
        System.out.println("student"+name);
        System.out.println("syudent"+usn);
        System.out.println("student"+college);
    }
}
class driver{
    public static void main(String[] args) {

    }
}