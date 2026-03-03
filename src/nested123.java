import java.util.Scanner;

public class nested123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary:");
        double sal = sc.nextDouble();
        double tax= 0;
        double netSalary;
        if (sal<300000){
            tax=0;
        }else{
            if(sal < 700000){
                tax=sal*0.10;
            }else{
                tax=sal*0.20;
            }
        }
        netSalary=sal-tax;
        System.out.println("tax amount"+ tax);
        System.out.println("net salary"+ netSalary);
    }
}
