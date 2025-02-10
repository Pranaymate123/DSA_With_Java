package Array_Package;

public class Maximum_Ascending_Sub_Array_Sum {
    public static int maxAscendingSum(int[] nums) {
        int maxSum=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] nums={10,20,30,5,10,50};

        System.out.println(maxAscendingSum(nums));

    }
}
