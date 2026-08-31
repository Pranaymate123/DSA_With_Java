package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

public class Find_Pivot_Index {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftPsum = new int[n];
        leftPsum[n-1]= nums[n-1];

        for(int i=n-2;i>=0;i--)
        {
            leftPsum[i] = leftPsum[i+1]+nums[i];
        }

        int rightPsum=0;

        for(int i=0;i<n;i++)
        {
            rightPsum+=nums[i];
            if(rightPsum==leftPsum[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));
    }
}
