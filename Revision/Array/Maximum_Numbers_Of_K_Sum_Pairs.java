package Revision.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maximum_Numbers_Of_K_Sum_Pairs {

//    public static int maxOperations(int[] nums, int k) {
//        Map<Integer,Integer> map=new HashMap<>();
//        int count=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            if(!map.containsKey(k-nums[i]))
//            {
//              map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//            }
//            else
//            {
//                if(map.get(k-nums[i])>0)
//                {
//                    count++;
//                    map.put(k-nums[i],map.get(k-nums[i])-1);
//                }
//                else
//                {
//                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//                }
//            }
//        }
//        return count;
//    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while (i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum==k)
            {
                count++;
                i++;
                j--;
            } else if (sum>k) {
                j--;
            }
            else {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={2,2,2,3,1,1,4,1};
        System.out.println(maxOperations(nums,4));
    }
}
