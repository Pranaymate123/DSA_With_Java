package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

public class Number_Of_Sub_Arrays_With_Bounded_Maximum {

//    How many valid subarrays end at index i?

    /*
    Instead of checking every subarray, I count the number of valid subarrays ending at each index.
     I track the last position containing an invalid element (> right), because any subarray crossing it is invalid.
      I also track the last position containing a value within [left, right], because every valid subarray must contain
      at least one such value. Therefore, for index i, every start position between (lastInvalid + 1) and lastValid
      forms a valid subarray ending at i. The count of such starts is lastValid - lastInvalid.
     */
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
       int lastInvalidIdx=-1;
       int lastValidIdx=0;
       int n = nums.length;

       int count=0;

       for(int i=0;i<n;i++)
       {
            if(nums[i]>right)
            {
                lastInvalidIdx=i;
            }
            else if(nums[i]>=left && nums[i]<=right)
            {
                lastValidIdx=i;
            }

            count=count + Math.max(0,lastValidIdx-lastInvalidIdx);
       }

        return count;
    }

    public static void main(String[] args) {
        int[] nums ={2,9,2,5,6};

        System.out.println(numSubarrayBoundedMax(nums,2,8));

    }
}
