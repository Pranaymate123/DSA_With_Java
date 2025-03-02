package Array_Package;

import java.util.Arrays;

public class Transform_Array_By_Parity {

    public static int[] transformArray(int[] nums) {


        int evenCount=0;
        int oddCount=0;
        for(int n:nums)
        {
            if(n%2==0) evenCount++;
            else  oddCount++;
        }
        for(int i=0;i<evenCount;i++)
        {
            nums[i]=0;
        }

        for(int j=evenCount;j<evenCount+oddCount;j++)
        {
            nums[j]=1;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={4,3,2,1};

        System.out.println(Arrays.toString(transformArray(nums)));
    }
}
