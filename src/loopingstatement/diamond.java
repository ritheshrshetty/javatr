package loopingstatement;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter");
        size = sc.nextInt();
        //upper
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * i; k <= 2 * size; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * i; k <= 2 * size; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


