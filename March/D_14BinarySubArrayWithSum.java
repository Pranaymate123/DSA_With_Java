package March;

import java.util.HashMap;
import java.util.Map;

public class D_14BinarySubArrayWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum==goal)
            {
                count++;
            }
            if(map.containsKey(sum-goal))
            {
                count+=map.get(sum-goal);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,1);
            }
            else
            {
                map.put(sum,map.get(sum)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr={1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr,2));
    }
}
