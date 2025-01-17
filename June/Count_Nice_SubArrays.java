package June;

public class Count_Nice_SubArrays {

    public static int numberOfSubarrays(int[] nums, int k) {

        int count=0;
        int i=0;
        int j=0;
        while (j<nums.length)
        {

            if(isOdd(nums[j]) && k>0)
            {
                k--;
                j++;
                if(k==0)
                {
                    count++;
                }
            }
            else if(isEven(nums[j]) && k==0)
            {
                    count++;
                    j++;
            }
            else if(isEven(nums[j]))
            {
                j++;
            } else if (isEven(nums[i]) && k==0) {
                i++;
                count++;
            } else if (isEven(nums[i])) {
                i++;

            } else if (isOdd(nums[i])) {
                k++;
                i++;
            }


        }
        while (isEven(nums[i]) && k==0)
        {
            k++;
            count++;
            i++;

        }
        return count;
    }

    public static boolean isOdd(int num)
    {
        return num%2==1;
    }
    public static boolean isEven(int num)
    {
        return num%2==0;
    }
    public static void main(String[] args) {

        int [] nums={2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(nums,2));
    }
}
