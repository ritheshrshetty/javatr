package oops.abstraction.complete.Multipleinheritance;

interface Mom {
    void cook();
}
interface Dad{
    void cook();
}
class child implements Mom,Dad{
    public void cook() {
        System.out.println("indian");
    }
}
class Driver{
    public static void main(String[] args) {
        child c=new child();
        c.cook();
    }
}