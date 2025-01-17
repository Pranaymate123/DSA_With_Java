package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextSmallerLeft {


    public static int [] nextSmallerLeft(int arr[])
    {
        Stack<Integer> stk=new Stack<>();
        int nextSmallLeft[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stk.isEmpty() && arr[i] <= arr[stk.peek()])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                nextSmallLeft[i]=-1;
            }
            else
            {
                nextSmallLeft[i]=stk.peek();
            }
            stk.push(i);
        }
        return nextSmallLeft;
    }
    public static int [] nextSmallerRight(int arr[])
    {
        Stack<Integer> stk=new Stack<>();
        int nextSmallRight[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && arr[i] <= arr[stk.peek()])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                nextSmallRight[i]=arr.length;
            }
            else
            {
                nextSmallRight[i]=stk.peek();
            }
            stk.push(i);
        }
        return nextSmallRight;
    }

    public static int largestRectangleArea(int[] arr) {
        int [] nextSmallerLeft=nextSmallerLeft(arr);
        int [] nextSmallerRight=nextSmallerRight(arr);

        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int width=nextSmallerRight[i]-nextSmallerLeft[i]-1;
            int area=width * arr[i];

            if(area>maxArea)
            {
                maxArea=area;
            }
        }

        return maxArea;

    }



    public static void main(String[] args) {
       int arr[]={2,4};
        System.out.println( Arrays.toString(nextSmallerLeft(arr)));
        System.out.println( Arrays.toString(nextSmallerRight(arr)));
        System.out.println(largestRectangleArea(arr));
    }
}
