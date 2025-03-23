package Array_Package;

import java.util.ArrayList;
import java.util.List;

public class Partition_Array_According_To_The_Given_Pivot {

    public int[] pivotArray(int[] nums, int pivot) {

        int lessCount=0;
        int eqCount=0;
        int moreCount=0;
        for(int n:nums)
        {
            if(n>pivot) moreCount++;
            else if (n<pivot) {
                lessCount++;
            }
            else
                eqCount++;
        }

        int i=0;
        int j=lessCount;
        int k=eqCount + lessCount;
        int[] ans=new int[nums.length];
        for(int n:nums)
        {
            if(n<pivot)
            {
                ans[i]=n;
                i++;
            } else if (n>pivot) {
                ans[k]=n;
                k++;
            }
            else
            {
                ans[j]=n;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
