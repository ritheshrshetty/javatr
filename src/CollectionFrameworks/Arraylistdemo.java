package CollectionFrameworks;

import java.util.ArrayList;

public class Arraylistdemo {
    static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(20);
        System.out.println("arraylist :"+ arr);
        //get()
        System.out.println("element at index 1 :"+arr.get(0));
        //size
        System.out.println("size: "+ arr.size());
        //contains()
        System.out.println("contains 30:"+arr.contains(30));
        //remove()
        arr.remove(2);
        System.out.println("after removing index"+ arr);
    }
}
/**
 * Maintains the insertion order
 * allows duplicates
 * dyanamic in size
 * index based access
 *
 */