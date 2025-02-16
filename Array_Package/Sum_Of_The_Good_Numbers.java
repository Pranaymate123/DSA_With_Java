package Array_Package;

public class Sum_Of_The_Good_Numbers {

    public static int sumOfGoodNumbers(int[] nums, int k) {

        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if((i-k)>=0 && (i+k) <n )
            {
                if(nums[i-k] < nums[i] && nums[i+k]<nums[i])
                {
                    System.out.println("nums "+ nums[i]);
                    sum+=nums[i];
                }
            }
            else if ((i+k)<n  ) {
                if(nums[i+k]<nums[i])
                {
//                    System.out.println("nums "+ nums[i]);
                    sum+=nums[i];
                }
            } else if ((i-k)>=0) {
                if(nums[i-k]<nums[i])
                {
//                    System.out.println("nums "+ nums[i]);
                    sum+=nums[i];
                }
            } else
            {
//                System.out.println("nums "+ nums[i]);
                sum+=nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] nums={1,3,2,1,5,4};
        System.out.println(sumOfGoodNumbers(nums,2));
    }
}
