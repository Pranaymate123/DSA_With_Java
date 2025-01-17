package BinarySearch;

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int result=0;

        for(int i=0;i<6;i++)
        {
            threshold=0;
            for(int j=0;j< nums.length;j++)
            {
                result+=(int)Math.round(nums[j]/i);
            }
            if(result<=threshold)
            {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println((int) Math.round(1/3));
    }
}
