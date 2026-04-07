package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;
public class Arraysubset {
    static void Arraysubset(int[] arr,int index,List<Integer>current){
        //base case
        if(index== arr.length){
            System.out.println(current);
            return;
        }
        //adding the element
        current.add(arr[index]);
        Arraysubset(arr,index+1,current);
        //backTracking
        current.remove(current.size()-1);
        //skip and explore
        Arraysubset(arr,index+1,current);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int index=0;
        Arraysubset(arr,index,new ArrayList<>());
    }
}
