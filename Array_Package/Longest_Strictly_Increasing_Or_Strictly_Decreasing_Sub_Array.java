package Array_Package;

public class Longest_Strictly_Increasing_Or_Strictly_Decreasing_Sub_Array {

    public static int longestMonotonicSubarray(int[] nums) {
        int ans=0;
        int longestIncreasing=1;
        int longestDecreasing=0;
        int Incount=1;
        int Decount=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                Incount++;
                Decount=1;
            }
            else if(nums[i]<nums[i-1])
            {
                Incount=1;
                Decount++;
            }
            else
            {
                Incount=1;
                Decount=1;
            }
            longestIncreasing=Math.max(longestIncreasing,Incount);
            longestDecreasing=Math.max(longestDecreasing,Decount);
        }
        return Math.max(longestDecreasing,longestIncreasing);
    }
    public static void main(String[] args) {
        int[] nums={1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(nums));

    }
}
