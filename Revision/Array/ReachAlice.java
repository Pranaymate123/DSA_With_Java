package Revision.Array;

import java.util.Arrays;
import java.util.Map;

public class ReachAlice {

    public static String reachAlice(int d, int x, int y, int k) {
        int walkT=d/x;
        int bikeT= (d/y) + k;

        if(walkT>bikeT)
        {
           return  "Bike";
        }
        return "Walk";
    }

    public static int[] removeOrder(int n, int[] arr, String str) {
       int[] result=new int[n];
       int l=0, h=n-1;
        Arrays.sort(arr);
        for(int i=0;i<str.length() && l<n && h>=0 ;i++)
        {
            if(str.charAt(i)=='0')
            {
                result[i]=arr[l];
                l++;
            }
            else
            {
                result[i]=arr[h];
                h--;
            }
        }
        return result;
    }

    public static long countSubarrays(int n, int[] arr) {

        int i=0;
        int j=1;
        int min=Math.min(arr[i],arr[j]);
        int max=Math.max(arr[i],arr[j]);

        int count=arr.length;
        while (i<j)
        {
            if((min+max)%(j-i+1)==0)
            {
                count++;
            }
            else if((min+max)>(j-i+1))
            {
                j++;
                max=Math.max(arr[j],max);
            } else if (j>n) {
                j--;
                max= Math.max(max,arr[j]);

            } else
            {
                i++;
                min=Math.min(arr[i],min);
            }

        }

        return 0;
    }

    public static long[] sumofItems(int n, int[] prices, int q, int[][] queries) {
        long[] result=new long[q];
        long sum=0;
        for(int i=0;i<q;i++)
        {
            if(queries[i][0]==1)
            {
                sum=0;
                for(int j=0;j<n;j++)
                {
                    prices[j]=prices[j]+queries[i][1];
                    sum=sum+prices[j];
                }
                result[i]=sum;
            } else if (queries[i][0]==2) {
                sum=0;
                for(int j=0;j<n;j++)
                {
                    if(prices[j]==queries[i][1])
                    {
                        prices[j]=queries[i][2];
                    }
                    sum=sum+prices[j];
                }
                result[i]=sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(reachAlice(150,3,10,37));
//        int[] arr={1,2,3};
//        int[] ans=removeOrder(3,arr,"111");
//        System.out.println(Arrays.toString(ans));
//        int[] arr={1,2,2,3,2};
//        System.out.println(countSubarrays(arr.length,arr));

        int [] prices={1,1,1};
        int[][] queries={{2,1,3},{2,3,6}};

        System.out.println(Arrays.toString(sumofItems(prices.length,prices,queries.length,queries)));
    }
}
