package Greedy;

import java.util.*;

public class Maximum_Num_Of_Integers_to_choose_from_range_I {

    public static int maxCount(int[] banned, int n, int maxSum) {

        Set<Integer> set=new HashSet<>();
        for(int e:banned)
        {
            set.add(e);
        }
        int sum=0;
        int count=0;

        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                count++;
                sum=sum+i;
                if(sum==maxSum) return count;
                if(sum>=maxSum) return count-1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] banned={1,6,5};
        int n=5;
        int maxSum=6;
        System.out.println(maxCount(banned,n,maxSum));
    }
}
