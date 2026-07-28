package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import Recursion.Array;

import java.util.Arrays;

public class Rotate_Array {

    public static void rotate(int[] nums, int k) {


        int n = nums.length;
        k=k%n;

        if(k==0) return;

//        first complete revserse
        reverseArray(nums,0,n-1);

        //reveser 0 to k-1
        reverseArray(nums,0,k-1);

        //reverse remaininng half
        reverseArray(nums,k,n-1);


    }


     public static void reverseArray(int[] nums , int start ,int end)
     {
         while (start<=end)
         {
             int temp = nums[start];
             nums[start]=nums[end];
             nums[end] = temp;
             start++;
             end--;
         }
     }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;


        rotate(nums,k);
    }
}
