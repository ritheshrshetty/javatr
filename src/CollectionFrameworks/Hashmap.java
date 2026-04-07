package CollectionFrameworks;

import java.util.HashMap;

public class Hashmap {
    static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"app");
        map.put(3,"bat");
        System.out.println(map);
        //get
        System.out.println(map.get(2));
        //containskey
        System.out.println("contains key 3?: "+map.containsKey(2));
        System.out.println("con"+map.containsValue("app"));
        //remove
        map.remove(1);
        System.out.println(map);

    }
}
