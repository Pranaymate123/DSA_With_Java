package March;

import java.util.Arrays;

public class D02_SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
       int [] result=new int[nums.length];
        int head=0;
        int tail=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[head]> nums[tail])
            {
                result[i]=nums[head];
                head++;
            }
            else {
                result[i]=nums[tail];
                tail--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={-5,-4,0,1,2,3};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
