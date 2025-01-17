package Revision.Array;

import java.util.ArrayList;
import java.util.List;

public class Second_Largest_Without_Sorting {
    public static int print2largest(List<Integer> arr) {

        if(arr.size()<2) return -1;
        int secondMax=Integer.MIN_VALUE;
        int Largest=Integer.MIN_VALUE;
        for(Integer num:arr)
        {
            if(num>Largest)
            {
                secondMax=Largest;
                Largest=num;
            } else if (num>secondMax && num!=Largest) {
                secondMax=num;
            }
        }
        if(secondMax==Integer.MIN_VALUE) return -1;
        return secondMax;
    }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(10);

        System.out.println(print2largest(arr));
    }
}
