package Revision.Array;

public class Max_Cosecutive_Ones {

    public static int getMaxConsecutiveOnesCount(int [] nums)
    {
        int maxSize=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                maxSize=Math.max(count,maxSize);
                count=0;
            }
        }
        maxSize=Math.max(count,maxSize);
        return maxSize;
    }

    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
        System.out.println(getMaxConsecutiveOnesCount(nums));
    }
}
