package Strings;

import java.util.*;

public class Minimum_Operations_To_Move_All_Balls_To_Box {


    //Optimal Approach

    public static int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] left=new int[n];
        int[] right=new int[n];
        int[] cSum=new int[n];
        //for left
        cSum[0]=boxes.charAt(0)=='1'?1:0;
        for(int i=1;i<n;i++)
        {
            cSum[i]=cSum[i-1]+(boxes.charAt(i)=='1'?1:0);
        }
        left[0]=0;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]+cSum[i-1];
        }
//        System.out.println("Left cSum "+ Arrays.toString(cSum));

        cSum[n-1]=boxes.charAt(n-1)=='1'?1:0;
        for(int i=n-2;i>=0;i--)
        {
            cSum[i]=cSum[i+1] +( boxes.charAt(i)=='1'?1:0);
        }
//        System.out.println("Right cSum "+ Arrays.toString(cSum));
        right[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+cSum[i+1];
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=left[i]+right[i];
        }

//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
        return ans;
    }
//    public static int[] minOperations(String boxes) {
//
//        List<Integer> lst =new ArrayList();
//        for(int i=0;i<boxes.length();i++)
//        {
//            if(boxes.charAt(i)=='1')
//            {
//                lst.add(i);
//            }
//        }
//
//        int[] ans=new int[boxes.length()];
//        for(int i=0;i<boxes.length();i++)
//        {
//            for(Integer e:lst)
//            {
//                ans[i]=ans[i]+Math.abs(e-i);
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("001011")));
    }
}
