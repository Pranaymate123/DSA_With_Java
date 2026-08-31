package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Kadanes_Algorithm;

public class Maximum_Product_SubArray {

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct=1;
        int rightProduct=1;

        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            leftProduct=leftProduct * nums[i];
            rightProduct= rightProduct * nums[n-i-1];

            maxProduct = Math.max(maxProduct , Math.max(leftProduct,rightProduct));

            if(leftProduct==0)
            {
                leftProduct=1;
            }
            if(rightProduct==0)
            {
                rightProduct=1;
            }
        }


        return maxProduct;
    }
    public static void main(String[] args) {

        int[] nums = {2,3,-2,-5,6,-1,4};
        System.out.println(maxProduct(nums));

    }
}
