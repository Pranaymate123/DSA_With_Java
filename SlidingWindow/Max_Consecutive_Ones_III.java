package SlidingWindow;

public class Max_Consecutive_Ones_III {

    public static int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        while (j<nums.length)
        {
            if(nums[j]==0 && k>0)
            {
                k--;
                j++;
            }
            else if (nums[j]==1)
            {
                j++;
            } else if (nums[i]==1) {
                i++;
            }
            else if(nums[i]==0)
            {
                k++;
                i++;
            }


                max=Math.max(max,j-i);

        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={0,0,0,1};
        int k=4;
        System.out.println(longestOnes(nums,k));
    }
}
