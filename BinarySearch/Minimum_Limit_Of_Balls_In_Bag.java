package BinarySearch;

public class Minimum_Limit_Of_Balls_In_Bag {

    public static int minimumSize(int[] nums, int maxOperations) {
        int max=getMaxElement(nums);

        int start=1;
        int end=max;
        int ans=-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(isPossible(nums,maxOperations,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] nums,int maxOperations,int mid)
    {
        int totalOperations=0;
        for(int e:nums)
        {
            totalOperations+=e%mid==0?(e/mid-1):e/mid;

            if(totalOperations>maxOperations) return false;
        }
        return totalOperations <= maxOperations;
    }

    public static int getMaxElement(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        for(int e:nums)
        {
            if(e>max)
            {
                max=e;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={7,17};
        System.out.println(minimumSize(nums,2));
    }
}
