package Backtracking_CodeStoryWithMik;

import java.util.HashMap;
import java.util.Map;

public class Max_Sum_Of_Pair_With_Equal_Digits {

    public static int maximumSum(int[] nums) {
        int maxSUM=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int digitSum=getDigitSum(nums[i]);
            if(!map.containsKey(digitSum))
            {
                map.put(digitSum,nums[i]);
            }
            else
            {
                maxSUM=Math.max(maxSUM,map.get(digitSum) + nums[i]);
                map.put(digitSum,Math.max(map.get(digitSum),nums[i]));
            }
        }

        return maxSUM;
    }

    public static int getDigitSum(int num)
    {
        int sum=0;
        while (num>0)
        {
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={18,43,36,13,7};

        System.out.println(maximumSum(nums));
    }
}
