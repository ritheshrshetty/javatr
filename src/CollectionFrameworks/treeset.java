package CollectionFrameworks;

import java.util.TreeSet;

public class treeset {
    static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        //add
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(10);

        System.out.println(set);

        //fisrt()
        System.out.println(set.first());
        //last()
        System.out.println(set.last());
        //remove()
        set.remove(30);
        System.out.println(set);
    }
}
