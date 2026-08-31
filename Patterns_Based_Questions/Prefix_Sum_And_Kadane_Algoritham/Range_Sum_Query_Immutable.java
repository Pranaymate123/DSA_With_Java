package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

public class Range_Sum_Query_Immutable {

    int[] pSum;
    public Range_Sum_Query_Immutable(int[] nums) {

        pSum=new int[nums.length];
        pSum[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pSum[i] = pSum[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0)
        {
            return pSum[right];
        }
        else{
            return pSum[right] - pSum[left-1];
        }
    }

    public static void main(String[] args) {

    }
}
