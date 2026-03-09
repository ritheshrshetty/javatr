package exceptionhandling;

import java.util.Scanner;

public class e3example {
    static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("bal");
            int balance=sc.nextInt();
            System.out.println("with");
            int withdraw= sc.nextInt();
            if (withdraw>balance){
                throw new ArithmeticException("insuffient");
            }
            System.out.println("withdraw success");
        }
        catch (ArithmeticException e){
            System.out.println("exception caught: "+ e.getMessage());

        }
    }
}
