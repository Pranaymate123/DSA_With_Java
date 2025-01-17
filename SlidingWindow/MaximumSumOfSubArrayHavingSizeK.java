package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumOfSubArrayHavingSizeK {
//    5,8,9,45,1,2,3,12,32,12''
    public static long getMaxSum(ArrayList<Integer> arr, int k)
    {
        int left=0;
        int right=0;
        //0-2 ==> size 3
        int maxSum=0;
        int sum=0;
        while (right<arr.size())
        {
            //window size k is given
            sum=sum+arr.get(right);
            if(right-left+1 < k)
            {
                right++;
            } else if (right-left+1 == k) {
                maxSum=Math.max(maxSum,sum);
                sum=sum-arr.get(left);
                left++;
                right++;
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>( Arrays.asList(1,5,4,2,9,9,9));
        System.out.println(getMaxSum(arr,3));
    }
}
