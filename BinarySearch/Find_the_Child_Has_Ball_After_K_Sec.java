package BinarySearch;

import java.util.Arrays;

public class Find_the_Child_Has_Ball_After_K_Sec {

    public static int numberOfChild(int n, int k) {
        int i=0;
        int m=0;
        while (m<k)
        {
               while (i<n-1 && m<k)
               {
                   i++;
                   m++;
               }

           while(i>0 && m<k)
           {
               i--;
             m++;
           }
        }
        return i;
    }

    public static int valueAfterKSeconds(int n, int k) {

        int[] arr=new int[n];
        Arrays.fill(arr,1);
        for(int i=0;i<k;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum= (sum+arr[j]) % 1000000007;
                arr[j]=sum;
            }

        }

        return arr[n-1]%1000000007;
    }

    public static void main(String[] args) {
//        int n=5;
//        int k=6;
//        System.out.println(numberOfChild(n,k));
        System.out.println(valueAfterKSeconds(5,1000));
    }
}
