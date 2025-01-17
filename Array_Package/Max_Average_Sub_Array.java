package Array_Package;

public class Max_Average_Sub_Array {
    public static double findMaxAverage(int[] nums, int k) {

        double maxAvg=Float.MIN_VALUE;
        double sum=0;
        double[] arr=new double[nums.length];
        double w=k;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        int i=0;
        int j=0;
        while (j<k)
        {
            sum=sum+arr[j];
            j++;
        }

        maxAvg= sum/w;


        while (j<nums.length)
        {
            sum=sum-arr[i];
            sum=sum+arr[j];
            double res=sum/w;
            if(res > maxAvg)
            {
                maxAvg=res;
            }
            i++;
            j++;
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
        double q=10;
        double p=3;


    }
}

