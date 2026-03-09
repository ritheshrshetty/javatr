package array.operation;

public class missingnumber {
    static void main(String[] args) {
        int[] arr ={1,3,4,5};
        int n=5;
        int total_sum=n*(n+1)/2;
        int actual_sum=0;
        for (int i = 0; i < arr.length; i++) {
            actual_sum+=arr[i];

        }
        System.out.println("missing no:"+(total_sum-actual_sum));
    }
}
