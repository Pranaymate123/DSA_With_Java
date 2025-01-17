package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TrappedRainWater {

    public static int[] getLeftMax(int arr[])
    {
        Stack<Integer> stk=new Stack<>();
        int [] leftMax= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(stk.isEmpty())
            {
                leftMax[i]=arr[i];
                stk.push(arr[i]);
            }
            else
            {
                leftMax[i]=stk.peek();
                if(arr[i]>stk.peek())
                {
                    stk.pop();
                    stk.push(arr[i]);
                }
            }
        }
        return leftMax;
    }
    public static int[] getRightMax(int arr[])
    {
        Stack<Integer> stk=new Stack<>();
        int [] rightMax= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(stk.isEmpty())
            {
                rightMax[i]=arr[i];
                stk.push(arr[i]);
            }
            else
            {
                rightMax[i]=stk.peek();
                if(arr[i]>stk.peek())
                {
                    stk.pop();
                    stk.push(arr[i]);
                }
            }
        }
        return rightMax;
    }

    public static int getTrappedWater(int arr[])
    {

        int []leftMax=getLeftMax(arr);
        int[] rightMax=getRightMax(arr);
        int trappedWater=0;
        for(int i=0;i<arr.length;i++)
        {

            int tw=Math.min(leftMax[i],rightMax[i]) -arr[i];
            if(tw<0)
            {
                continue;
            }
            trappedWater+=tw;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(Arrays.toString(getLeftMax(arr)));
        System.out.println(Arrays.toString(getRightMax(arr)));
        System.out.println(getTrappedWater(arr));
    }
}
