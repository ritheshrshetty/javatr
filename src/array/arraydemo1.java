package array;

public class arraydemo1 {
    static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[5];
        System.out.println(arr1[1]);
        //System.out.println(arr1);//wrong way
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
