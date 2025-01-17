package SlidingWindow.Variable;

public class Minimum_Size_SubArray_Sum {

    public static int minSubArrayLen(int target, int[] nums) {
       int i=0;
       int j=0;
       int sum=0,minSize=Integer.MAX_VALUE;
       while (j<nums.length)
       {
           sum=sum+nums[j];
           if (sum>=target)
           {
               //window size chota karne ka try kar raha hu
               while (sum>=target)
               {
                   sum=sum-nums[i];
                   minSize=Math.min(minSize,j-i+1);
                   i++;
               }
           }
           j++;
       }
       return  minSize==Integer.MAX_VALUE?0:minSize;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,5};
        System.out.println(minSubArrayLen(7,nums));
    }
}
