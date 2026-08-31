package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

public class Zero_Array_Transformation_I {

    public static boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];

        if(checkAllZeroes(nums))
        {
            return true;
        }

        for(int[] q: queries)
        {
            int l = q[0];
            int r = q[1];
            int x = 1;

            diff[l] +=x;
            if(r+1 < n)
            {
                diff[r+1]-=x;
            }
        }

        //take cumulative sum
        int cSum=0;
        for(int i=0;i<n;i++)
        {
            cSum+=diff[i];
            diff[i]=cSum;

            if(nums[i] - diff[i] > 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAllZeroes(int[] nums)
    {
        for(int n:nums)
        {
            if(n!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1};
        int[][] queries = {{0,2}};

        System.out.println(isZeroArray(nums,queries));
    }
}
