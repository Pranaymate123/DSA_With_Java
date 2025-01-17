package Collections_Revise.List_Revise;

import java.util.*;

public class ArrayList_Revise {

    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("Pranay");
        lst.add("Raj");
        lst.add("ERK");
        lst.add("Vaibhav");
        System.out.println(lst);

        System.out.println(lst.size());
        System.out.println(lst.get(0));
        System.out.println(lst.get(1));
        System.out.println(lst.get(2));
        System.out.println(lst.get(3));

        System.out.println(lst.isEmpty());
        System.out.println(lst.remove("ERK"));
        System.out.println(lst);
        System.out.println(lst.indexOf("Pranay"));
        System.out.println(Arrays.toString(lst.toArray()));

        System.out.println(lst.get(0).getClass().getName());
    }
}
