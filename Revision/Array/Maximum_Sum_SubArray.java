package Revision.Array;

public class Maximum_Sum_SubArray {

//    public static int maxSubArray(int[] nums) {
//         int sum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++)
//         {
//             sum=sum+nums[i];
//             maxSum=Math.max(maxSum,sum);
//
//             if(i<nums.length-1 && (sum+nums[i+1])<nums[i+1])
//             {
//                 sum=0;
//             }
//         }
//
//        return maxSum;
//    }
    public static int maxSubArray(int[] nums) {
//        Kadane's Approach When sum gets -ve make it zero start with new sum
         int sum=0;
         int maxSum=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++)
         {
             sum=sum+nums[i];
             maxSum=Math.max(maxSum,sum);

             if(sum<=0)
             {
                 sum=0;
             }
         }
        return maxSum;
    }

    public static void main(String[] args) {
        int[]nums={8,-19,5,-4,20};
        System.out.println(maxSubArray(nums));

    }
}
