package oops.abstraction.partial;

abstract class RBI {
    abstract int roi();
}
class hdfc extends RBI{
    int roi(){
        return 10;
    }
}
class sbi extends RBI{
    int roi(){
        return 6;

        }
    }

class Driver1{
    public static void main(String[] args) {
        hdfc h=new hdfc();
        System.out.println("hdfc"+h.roi());
        sbi s=new sbi();
        System.out.println("sbi"+s.roi());
    }
}