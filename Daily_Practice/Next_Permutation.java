package Daily_Practice;

import java.util.Arrays;

public class Next_Permutation {

    public static void nextPermutation(int[] nums) {
        //1) Find the Element from Right to Left arr[i-1]<arr[i]
        //2) Consider i-1 is swapping index
        //3) now find the next immediately greater element than the element at i-1 idx lets say we find j
        //4) Swap the i-1 and the idx j
        //5) Then reverse the array from index i to n-1  and you got the next permutation

        int n=nums.length;
        int swap_idx=-1;
        for(int i = n-1; i>0 ;i--)
        {
            if(nums[i-1] < nums[i])
            {
                swap_idx=i-1;
                break;
            }
        }



        if(swap_idx!=-1 )
        {
            int next_idx = findNextGreaterElementIdx(nums,swap_idx);
            int temp = nums[swap_idx];
            nums[swap_idx] = nums[next_idx];
            nums[next_idx] = temp;

        }
//        System.out.println(Arrays.toString(nums));

        reverseArray(nums,swap_idx+1,n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(int[] nums, int startIdx, int endIdx)
    {
        while(startIdx<=endIdx) {
            int temp = nums[startIdx];
            nums[startIdx] = nums[endIdx];
            nums[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }
    public static int findNextGreaterElementIdx(int[] nums,int idx)
    {
        int ans=Integer.MAX_VALUE;
        int ansIdx=-1;
        for(int i=nums.length-1;i>=idx+1;i--)
        {
            if(nums[i]>nums[idx])
            {
                ansIdx=i;
                break;
            }
        }

        return  ansIdx;

    }
    public static void main(String[] args) {

        int[] arr= {2,3,1,3,3};
        nextPermutation(arr);
    }
}
