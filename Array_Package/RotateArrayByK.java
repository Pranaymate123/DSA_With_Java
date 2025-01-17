package Array_Package;

import java.util.Arrays;

public class RotateArrayByK {

    public static void rotate(int[] nums, int k) {

        k=k% nums.length;
        if(k==0)
        {
            return;
        }
        int n=nums.length;
        rotateArray(nums,n-k,n-1);

        rotateArray(nums,0,n-k-1);

        rotateArray(nums,0, n-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArray(int [] arr,int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
//        int [] nums={1,-100,3,99};
        rotate(nums,3);
    }
}
