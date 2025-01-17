package Revision.Array;

public class Max_Consecutives_Ones_III {

    public static int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int largest=0;
        while (j<nums.length)
        {
            if(nums[j]==1)
            {
                j++;
            } else if (nums[j]==0 && k>0) {
                k--;
                j++;
            } else if (nums[j]==0 && k==0) {
                largest=Math.max(largest,j-i);
                while (k==0)
                {
                    if(nums[i]==0)
                    {
                        k++;
                    }
                    i++;
                }
            }
        }
        largest=Math.max(largest,j-i);
        return largest;
    }
    public static void main(String[] args) {
        int[] nums={0,0,0,1};
        System.out.println(longestOnes(nums,4));
    }
}
