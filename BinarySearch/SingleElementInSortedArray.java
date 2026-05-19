package BinarySearch;

public class SingleElementInSortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[0];
        int l=0;
        int h= n-1;
        while (l<h) {
            int m = l + (h - l) / 2;

            boolean isEven;

            int ele = h-m;

            if(ele%2==0)
            {
                isEven=true;
            }
            else{
                isEven=false;
            }

            if(nums[m]==nums[m+1])
            {
                if(isEven)
                {
                    l=m+2;
                }
                else{
                    h=m-1;
                }
            }
            else{
                if(isEven)
                {
                    h=m;
                }
                else {
                    l=m+1;
                }
            }

        }

        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,5,5};

        System.out.println(singleNonDuplicate(nums));
    }
}
