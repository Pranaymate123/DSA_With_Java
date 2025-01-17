package Array_Package;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j]!=nums[i])
            {
                j++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }
    public static void main(String[] args) {
        int [] nums={1,1,1,2,2,2,3,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
