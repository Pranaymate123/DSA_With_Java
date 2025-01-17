package Revision.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort_Array_By_Increasing_Frequency {

    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int k=0;
        while (!map.isEmpty())
        {
            int min=getMinimum(map);
            int count=map.get(min);
            for(int i=0;i<count;i++)
            {
                nums[k]=min;
                k++;
            }
            map.remove(min);
        }
        return nums;
    }

    public static int getMinimum(Map<Integer,Integer> map)
    {
        int min=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(Integer key:map.keySet())
        {
            if(map.get(key) < min)
            {
                min=map.get(key);
                ans=key;
            } else if (map.get(key)==min) {
                ans=Math.max(ans,key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,3,3,3};

        System.out.println(Arrays.toString(frequencySort(arr)));
    }
}
