package loopingstatement;

import java.util.Scanner;

public class pyramidpattern {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        size = sc.nextInt();
        //upper
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //lower
        for (int i = size-2; i>=0; i--) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

