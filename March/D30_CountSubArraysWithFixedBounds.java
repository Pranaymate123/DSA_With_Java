package March;

public class D30_CountSubArraysWithFixedBounds {

    public static long countSubarrays(int[] nums, int minK, int maxK) {

        int j=0;
       int min=-1;
       int max=-1;
       int badB=-1;
       long count=0;

        while (j<nums.length)
        {
            if(nums[j]==minK)
            {
                min=j;
            }
            if (nums[j]==maxK) {
                max=j;

            }
            if(nums[j]<minK || nums[j]>maxK)
            {
                badB=j;
            }
           count+=Math.max(0,Math.min(min,max)-badB);
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] nums={1,3,5,2,7,5,2,1,8,5};
        int[] nums={1,1,1,1};
        System.out.println(countSubarrays(nums,1,1));
    }
}
