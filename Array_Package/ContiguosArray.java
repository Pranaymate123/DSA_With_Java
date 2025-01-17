package Array_Package;

import java.util.HashMap;
import java.util.Map;

public class ContiguosArray {
    public static int findMaxLength(int[] nums) {
        int maxLength=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        //treating 0 as -1 and checking for the sum getting zero
        int prefixSum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                prefixSum+=1;
            }
            else
            {
                prefixSum=prefixSum-1;
            }
            if(!map.containsKey(prefixSum))
            {
                map.put(prefixSum,i);
            }
            else
            {
                maxLength=Math.max(i-map.get(prefixSum),maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int [] arr={0,0,1,0,0,0,1,1};
        System.out.println(findMaxLength(arr));
    }
}
