package March;

import java.util.HashMap;
import java.util.Map;

public class D_08CountElementWithMaxFreq {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int maxFreq=Integer.MIN_VALUE;
        for (Integer item:map.values()) {
            if(item>maxFreq)
            {
                maxFreq=item;
            }
        }
        int totalFreq=0;
        for (Integer item:map.values()) {
            if(item==maxFreq)
            {
                totalFreq+=maxFreq;
            }
        }
        return totalFreq;
    }

    public static void main(String[] args) {
        int [] arr={1,1,12,1,12,12,12};
        System.out.println(maxFrequencyElements(arr));
    }
}
