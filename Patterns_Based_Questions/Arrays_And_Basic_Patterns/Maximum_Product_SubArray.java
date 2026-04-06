package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

public class Maximum_Product_SubArray {

    public static int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        int leftProduct =1;
        int rightProduct =1;
        int n = nums.length;
        int product=1;

        for(int i=0;i<n;i++)
        {

            if(leftProduct==0 ) leftProduct=1;

            if(rightProduct==0 ) rightProduct=1;

            leftProduct=leftProduct * nums[i];
            rightProduct = rightProduct * nums[n-i-1];


            maxProduct=Math.max(maxProduct , Math.max(leftProduct,rightProduct));
            //We have to only care about the array having -ve numbers count odd

            //We are calculating the maxProduct just After calculating the leftProduct and RightProduct So we utilize the 0 as our maxProduct
            // in case we have te -ve maxProduct and for nextIteration to continue and leave zero we make leftProduct or RightProduct 1
            //If they are zero this is the logic
        }

        return  maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        System.out.println(maxProduct(nums));
    }
}
