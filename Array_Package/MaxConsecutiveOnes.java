package Array_Package;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                maxCount=Math.max(count,maxCount);
                count=0;
            }
            else
            {
                count++;
            }
        }

        return Math.max(count,maxCount);
    }

    public static void main(String[] args) {
        int [] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

}
