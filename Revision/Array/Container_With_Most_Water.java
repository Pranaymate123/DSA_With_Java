package Revision.Array;

public class Container_With_Most_Water {

    public static int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int maxArea=0;
        while (left<right)
        {
            maxArea=Math.max(maxArea,(right-left) * Math.min(arr[left],arr[right]));
            if(arr[left]<arr[right])
            {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
