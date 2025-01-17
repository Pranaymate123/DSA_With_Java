package Revision.Array;

public class Longest_SubArray_Sum_Less_Than_K {

    public static int getLongestSubArray(int[] nums,int k)
    {
        //Longest SubArray with sum less than k
        int i=0;
        int j=0;
        int sum=0;
        int maxSize=0;
        while (j<nums.length)
        {
            if(sum<=k)
            {
                sum=sum+nums[j];
                maxSize=Math.max(maxSize,j-i+1);
                j++;
            }
            else
            {
                while (sum>k)
                {
                    sum=sum-nums[i];
                    i++;
                }
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getLongestSubArray(nums,15));
    }

}
