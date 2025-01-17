package Revision.Array;

import java.util.ArrayList;
import java.util.List;

public class Count_Homogenous {

    public static int countHomogenous(String s) {
        int i=0;
        int result=0;
        int j=0;
       char [] arr=s.toCharArray();
       while(j<arr.length-1)
       {
           if(arr[j]==arr[j+1])
           {
               j++;
           }
           else
           {

               result+=helper(j-i+1);
               j++;
               i=j;

           }
       }
       //for last
        result+=helper(j-i+1);
        return result;
    }

    public static int helper(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n + helper(n-1);
    }

    public static void main(String[] args) {
//        String str="abbcccaa";
////        System.out.println(countHomogenous(str));
//        System.out.println(countHomogenous(str));


    }
}
