package CollectionFrameworks;

import java.util.TreeMap;

public class Treemap {
    static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(3,"a");
        map.put(1,"w");
        map.put(2,"w");
        System.out.println(map);
        //get
        System.out.println(map.get(2));
        //fisrt key-->smallest key
        System.out.println(map.firstKey());
        //last key --> largest
        System.out.println(map.lastKey());
        //remove
        map.remove(2);
        System.out.println(map);
    }
}
