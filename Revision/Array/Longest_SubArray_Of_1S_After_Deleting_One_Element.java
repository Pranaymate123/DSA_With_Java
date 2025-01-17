package Revision.Array;

public class Longest_SubArray_Of_1S_After_Deleting_One_Element {

    public static int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int k=1;
        int max=0;
        while (j<nums.length)
        {
            if(nums[j]==0 && k==1)
            {
                k=0;
                j++;
            } else if (nums[j]==0 && k==0) {
                max=Math.max(max,j-i-1);

                while (k==0)
                {
                    if(nums[i]==0)
                    {
                        k=1;
                        i++;
                    }
                    else
                    {
                        i++;
                    }
                }
            }
            else if(nums[j]==1)
            {
                max=Math.max(max,j-i);
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
