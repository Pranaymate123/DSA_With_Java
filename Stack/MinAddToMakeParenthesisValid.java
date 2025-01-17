package Stack;

import java.util.Stack;

public class MinAddToMakeParenthesisValid {
    public static  int minAddToMakeValid(String s) {
        Stack<Character> stk =new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                stk.push(ch);
            }
            else
            {
                if(!stk.isEmpty() && stk.peek()=='(')
                {
                    stk.pop();
                }
                else
                {
                    stk.push(ch);
                }
            }


        }

        return stk.size();
    }

    public static int getMinFor2Close(String s)
    {
        Stack<Character> stk =new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                stk.push(ch);
            }
            else if((i+1) <= s.length()-1 && s.charAt(i)==')' && s.charAt(i+1)==')')
            {
                if(!stk.isEmpty() && stk.peek()=='(')
                {
                    stk.pop();
                }
                else
                {
                    stk.push(s.charAt(i));
                    stk.push(s.charAt(i+1));
                }
                i++;
            }
            else
            {
                stk.push(ch);
            }
        }
        System.out.println(stk);
        return stk.size();
    }

    public static void main(String[] args) {
        String s="(()))";
//        System.out.println(minAddToMakeValid(s));
        System.out.println(getMinFor2Close(s));
    }
}
