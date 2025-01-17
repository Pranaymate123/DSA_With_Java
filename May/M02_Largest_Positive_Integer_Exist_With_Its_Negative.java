package May;

import java.util.HashSet;
import java.util.Set;

public class M02_Largest_Positive_Integer_Exist_With_Its_Negative {

    public static int findMaxK(int[] nums) {
        int largest=-1;
        Set<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.contains(-(nums[i])))
            {
                if(nums[i]<0)
                {
                    if(-nums[i]>largest)
                    {
                        largest=-nums[i];
                    }
                }
                else {
                    if(nums[i]>largest)
                    {
                        largest=nums[i];
                    }
                }
            }
            else {
                hash.add(nums[i]);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums={-1,10,6,7,-12,8};
        System.out.println(findMaxK((nums)));
    }
}
