package Recursion;

public class fibonacciiteration{
    static void main(String[] args) {
        int n=5;
        int n1=0,n2=1,sum=0;
        System.out.println(n1+"  "+n2);
        for (int i = 2; i < n; i++) {
            sum=n1+n2;
            System.out.print(sum +"  ");
            n1=n2;
            n2=sum;

        }
    }
}
