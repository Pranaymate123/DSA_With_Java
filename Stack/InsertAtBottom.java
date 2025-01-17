package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class InsertAtBottom {


    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        helper(st,x);
        return st;
    }

    public static void helper(Stack<Integer> st, int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return;
        }
        int top=st.pop();
        helper(st,x);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverseStack(s);
        insertAtBottom(s,top);
    }

    public static String reverseString(String s)
    {
        String res="";
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stk.push(s.charAt(i));
        }
        while (!stk.isEmpty())
        {
            res=res.concat(stk.pop().toString());
        }
        return res;


    }

    public static void main(String[] args) {
//        Stack<Integer> stk=new Stack<>();
//        stk.push(1);
//        stk.push(2);
//        stk.push(3);
//
//
//        reverseStack(stk);
//        System.out.println(stk);

        int arr[]={6,8,0,1,3};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int flag=0;
            for(int j= i+1 ;j<arr.length ;j++)
            {
                if(arr[i]< arr[j])
                {
                    flag=1;
                    ans.add(arr[j]);
                    break;
                }
            }
            if(flag==0)
            {
                ans.add(-1);
            }
        }


        System.out.println(ans);
    }
}
