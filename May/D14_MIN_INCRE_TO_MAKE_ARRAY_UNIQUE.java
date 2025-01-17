package May;

import java.util.HashSet;
import java.util.Set;

public class D14_MIN_INCRE_TO_MAKE_ARRAY_UNIQUE {

    public static int minIncrementForUnique(int[] nums) {
        Set<Integer> hash=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!hash.contains(nums[i]))
            {
                hash.add(nums[i]);
            }
            else
            {
                int num=nums[i];
                while (hash.contains(num))
                {
                    num=num+1;
                    count++;
                }
                hash.add(num);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(minIncrementForUnique(nums));
    }
}

