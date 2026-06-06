package BinarySearch;


public class Search_In_Rotated_Array_II {

    public static boolean search(int[] nums, int target) {

        int n=nums.length;

        int l=0;
        int h=n-1;

        //Skip dupluicates from both sides
        while(l<h && nums[l]==nums[l+1])
        {
            l++;
        }

        while (l<h && nums[h]==nums[h-1])
        {
            h--;
        }

        while (l<h)
        {
            int mid = l+(h-l)/2;

            if(nums[mid]==target)
            {
                return true;
            }
            else if(nums[h]>nums[mid])
            {
                h=mid;
            }
            else{
                l=mid+1;
            }
        }

        return binarySearch(nums,0,l-1,target) || binarySearch(nums,l,n-1,target);

    }
    public static boolean binarySearch(int[] nums,int l , int h , int target)
    {
        while (l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]==target) {
                return true;
            }
            else if(nums[mid] > target) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println(search(nums,13));
    }
}
