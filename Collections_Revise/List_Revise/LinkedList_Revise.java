package Collections_Revise.List_Revise;

import java.util.*;

public class LinkedList_Revise {

    public static void main(String[] args) {
        List<Integer> lst=new LinkedList<>();
        lst.add(100);
        lst.add(101);
        lst.add(102);
        lst.add(103);
        lst.add(104);
        lst.add(105);

        System.out.println(lst);
        System.out.println(lst.get(0));
        System.out.println(lst.get(1));
        System.out.println(lst.get(2));
        System.out.println(lst.get(3));
        System.out.println(lst.get(4));


        System.out.println(lst.remove(0));
        System.out.println(lst.size());
        System.out.println(lst.isEmpty());

        System.out.println(lst.contains(100));
        System.out.println(Arrays.toString(lst.toArray()));


        ///Trverse using forEach
        for(Integer e:lst)
        {
            System.out.println(e);
        }
        //Iterator
        Iterator<Integer> iterator = lst.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("_________________________________________________");
        //ListIterator
        //Backward traversal
        ListIterator<Integer> integerListIterator = lst.listIterator(lst.size());
        while (integerListIterator.hasPrevious())
        {
            System.out.println(integerListIterator.previous());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        //ForEach Method
        lst.forEach(ele -> {
            System.out.println(ele+2);
        });

       

    }
}
