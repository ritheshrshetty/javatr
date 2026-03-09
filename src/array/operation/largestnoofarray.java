package array.operation;

public class largestnoofarray {
    static void main(String[] args) {
        int[] num={1,43,56,2,88};
        int max=num[0];
        for (int i = 1; i <num.length ; i++) {
            if(num[i]>max){
                max=num[i];

            }

        }
        System.out.println(max);
    }
}
