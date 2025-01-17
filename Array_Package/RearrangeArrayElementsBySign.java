package Array_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {
        int [] ans=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                ans[j]=nums[i];
                j=j+2;
            }
            else
            {
                ans[k]=nums[i];
                k=k+2;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int nums[]={3,-2,1,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
