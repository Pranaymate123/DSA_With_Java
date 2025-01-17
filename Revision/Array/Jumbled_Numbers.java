package Revision.Array;

import java.util.*;

public class Jumbled_Numbers {

    static class  Pair
    {
        int num;
        int idx;

        public Pair(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }
    public static   int[] sortJumbled(int[] mapping, int[] nums) {
        List<Pair> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            lst.add(new Pair(getMappedNumber(nums[i],mapping),i));
        }
        lst.sort((a,b)->a.num-b.num);



        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int idx=lst.get(i).idx;
            result[i]=nums[idx];
        }
        return result;
    }

    public static int getMappedNumber(int n,int[] mapping)
    {
        if(n<10) return mapping[n];
        int mappedNum=0;
        int placeNumber=1;
        while (n>0)
        {
            int rem=n%10;
            rem=mapping[rem];
            mappedNum= mappedNum+(rem*placeNumber);
            placeNumber=placeNumber*10;
            n=n/10;
        }
        return mappedNum;
    }
    public static void main(String[] args) {
        int[] mapping={7,9,4,1,0,3,8,6,2,5};
        int[] nums={47799,19021,162535,454,95,51890378,404};
        System.out.println(Arrays.toString(sortJumbled(mapping,nums)));

//        System.out.println(getMappedNumber(404,mapping));
    }
}
