package Timecomplexity.seachingsorting;

public class Linearsearch {
    static int Linearsearch(int key,int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int key=50;
        int result=Linearsearch(key,arr);
        if(result!=-1){
            System.out.println("found the element: "+result);
        }
        else {
            System.out.println("element not there");
        }
    }
}
