package Array_Package;

import java.util.Arrays;

public class ProductOfArayExceptSelf {
    public static int[] getProduct(int []arr)
    {
        int n=arr.length;
        int leftPrefix[]=new int[n];
        int rightPrefix[]=new int[n];

        leftPrefix[0]=1;
        for(int i=1;i<n;i++)
        {
            leftPrefix[i]= leftPrefix[i-1] * arr[i-1];
        }
        rightPrefix[n-1]=1;

        for(int i=n-2;i>=0;i--)
        {
            rightPrefix[i]=rightPrefix[i+1]*arr[i+1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=rightPrefix[i] * leftPrefix[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-1,1,0,3,-3};
        System.out.println(Arrays.toString(getProduct(arr)));
    }
}
