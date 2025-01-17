package Revision.Array;

import java.util.Arrays;

public class DiffSquareRoots {

    public static int getDiff(int m,int n)
    {
        int evenSum=0;
        int oddSum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
            {
                evenSum+=getSquareRoot(i);
            }
            else
            {
                oddSum+=getSquareRoot(i);
            }
        }
        return evenSum-oddSum;
    }
    public static int getSquareRoot(int num)
    {
        int n=num;
        int start=1;
        int end=num;
        int mid=-1;
        while(n!=0)
        {
             mid=start+(end-start)/2;
            if((mid*mid)==num)
            {
                return mid;
            } else if (mid*mid > num) {
                end=mid;
            }
            else {
                start=mid;
            }
            n--;
        }
        return mid;
    }

    public static int getMaxCarsParked(String str)
    {
        int i=0;
        int j=0;
        int ans=0;
        int count=0;
        while(j<str.length())
        {
            if(str.charAt(j)=='S')
            {
                count++;
                j++;
            } else if (str.charAt(j)=='X' && count>1) {
                ans+=count;
                count=0;
            }
            else
            {
                count=0;
                while(i<str.length() && str.charAt(i)=='X')
                {
                    i++;
                }
                while(j<str.length() && str.charAt(j)=='X')
                {
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(getSquareRoot(12));
//        System.out.println(getDiff(20,80));
        String str="XXXSXXXSXXXSXX";
//        System.out.println(getMaxCarsParked(str));
        int[] arr={10,20,30,40,50};
        System.out.println(arr[Arrays.binarySearch(arr,10) + 1]);
    }

}
