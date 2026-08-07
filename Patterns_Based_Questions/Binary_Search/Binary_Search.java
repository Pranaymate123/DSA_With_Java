package Patterns_Based_Questions.Binary_Search;

public class Binary_Search {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int h=n-1;

        while (l<=h)
        {
            int mid = l+ (h-l)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid] < target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50,60,70};

        System.out.println(search(nums,60));
    }
}
