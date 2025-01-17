package Collections_Revise.Set_Revise;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set_Revise {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        System.out.println(set);

        System.out.println(set.contains(10));
        System.out.println(set.isEmpty());
        System.out.println(set.size());


    }
}
