package Array_Package;

import java.util.Arrays;

public class MaxProductSubArray {

    public static int getMaxProduct(int [] arr)
    {

        int prefixProduct=1;
        int suffixProduct=1;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            if(prefixProduct==0) prefixProduct=1;
            if(suffixProduct==0) suffixProduct=1;
            //start multiplying from start
            prefixProduct*=arr[i];
            //start multiplying from last;

            suffixProduct*=arr[arr.length-1-i];

            maxProduct=Math.max(maxProduct,Math.max(prefixProduct,suffixProduct));

        }
        return  maxProduct;
    }


    public static void main(String[] args) {
        int[] arr={1,5,-2,3,6,8,-4,5,-9,1};
        System.out.println(getMaxProduct(arr));
    }
}
