package Array_Package;

import java.util.Arrays;

public class Special_Array_II {

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {

        int[] prefixSum=new int[nums.length];
        int n=nums.length;
        prefixSum[0]=0;
        for(int i=1;i<n;i++)
        {
            if(!isCorrectParityPair(nums[i-1],nums[i]))
            {
                prefixSum[i]=prefixSum[i-1]+1;
            }
            else
            {
                prefixSum[i]=prefixSum[i-1];
            }
        }
        boolean[] result=new boolean[queries.length];
        int k=0;
        for(int[] row:queries)
        {
            result[k]= prefixSum[row[1]] - prefixSum[row[0]] == 0;
            k++;
        }
        return result;

    }
    public static boolean isCorrectParityPair(int num1,int num2)
    {
        if(num1%2==0 && num2%2==0) return false;
        if(num1%2==1 && num2%2==1) return false;

        return true;
    }
    public static void main(String[] args) {
        int[] nums={4,3,1,6};

        int[][] queries={{0,2},{2,3}};
        System.out.println(Arrays.toString(isArraySpecial(nums,queries)));

    }
}
