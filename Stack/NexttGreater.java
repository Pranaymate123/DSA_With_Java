package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NexttGreater {

    public static long[] findNextGreater(long[] arr,int n)
    {
        Stack<Long> stk=new Stack<>();
        long [] nextGreater=new long[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stk.isEmpty() && arr[i] >= stk.peek())
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                nextGreater[i]=-1;
            }
            else {
                nextGreater[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        long arr[]={6,8,0,1,3};
        System.out.println(Arrays.toString(findNextGreater(arr,5)));
    }
}
