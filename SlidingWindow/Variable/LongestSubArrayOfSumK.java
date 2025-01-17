package SlidingWindow.Variable;

public class LongestSubArrayOfSumK {

    public static int longestSubArrayOfSumK(int arr[],int k)
    {
        int i=0,j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while (j<arr.length)
        {
            sum=sum+arr[j];
            if(sum<k)
            {
                j++;
            } else if (sum==k) {
                max=Math.max(max,j-i+1);
                j++;
            }
            else {
                while (sum>k)
                {
                    sum=sum-arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 2, 3};
         System.out.println(longestSubArrayOfSumK(arr,5));
    }
}
