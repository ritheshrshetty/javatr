package exceptionhandling;

public class e3 {
      static void checkage(int age){
        if (age >=18){
            System.out.println("accss granted");
        }
        else {
            throw new ArithmeticException("Access denied");
        }
    }
    public static void main(String[] args) {
        checkage(30);
        checkage(8);
    }
}
