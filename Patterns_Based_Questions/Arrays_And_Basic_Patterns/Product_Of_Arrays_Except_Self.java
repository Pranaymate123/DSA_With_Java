package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

import java.util.Arrays;

public class Product_Of_Arrays_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] leftProduct = new int[n];
//        int[] rightProduct = new int[n];
//        leftProduct[0] = 1;
//        rightProduct[n-1] = 1;
//        for(int i=0;i< n-1;i++)
//        {
//            leftProduct[i+1] = leftProduct[i] * nums[i];
//        }
//
//        for(int i=n-2;i>=0;i--)
//        {
//            rightProduct[i] = rightProduct[i+1] * nums[i+1];
//        }
//
////        System.out.println(Arrays.toString(leftProduct));
////        System.out.println(Arrays.toString(rightProduct));
//
//        int[] ans = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            ans[i] = leftProduct[i] * rightProduct[i];
//        }
//
//        return ans;

        //Better Approach use the ans Array to store the leftProduct and in way Compute the RightProduct
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for(int i=0;i< n-1;i++)
        {
            ans[i+1] = ans[i] * nums[i];
        }


        int rightProduct = 1;
        for(int i=n-1;i>=0;i--)
        {
           ans[i] = ans[i] * rightProduct;
           //compute the right product for next iteration going backwards
            rightProduct = rightProduct * nums[i];
        }
     return  ans;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,0,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
