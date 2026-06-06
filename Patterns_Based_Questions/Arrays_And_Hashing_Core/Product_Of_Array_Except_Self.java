package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
      int[] rightProduct = new int[n];

      rightProduct[n-1] = 1;

      for(int i=n-2;i>=0;i--)
      {
          rightProduct[i] = rightProduct[i+1] * nums[i+1];
      }

      int leftProduct = 1;
      for(int i=0;i<n;i++)
      {
          int temp = nums[i];
          nums[i] = leftProduct * rightProduct[i];
          leftProduct=leftProduct * temp;
      }

//        System.out.println(Arrays.toString(rightProduct));
      return nums;
    }

    public static void main(String[] args) {
        int[] nums ={-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
