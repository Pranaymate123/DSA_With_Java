package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Counting_Sort {


    public static int[] sortArray(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(nums[i]>max) max=nums[i];

            if(nums[i]<min) min=nums[i];
        }
        int k=0;
        for(int i=min;i<=max;i++)
        {
            if(map.containsKey(i))
            {
                int num=map.get(i);
                for(int j=0;j<num;j++)
                {
                    nums[k]=i;
                    k++;
                }
            }
        }

        return nums;
    }


    public static void main(String[] args) {
        int[] nums={5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
