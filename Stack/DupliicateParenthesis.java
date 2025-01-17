package Stack;

import java.util.Stack;

public class DupliicateParenthesis {
    public static int checkDuplicateParenthesis(String s)
    {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                int count=0;
                while(stk.peek() != '(')
                {
                    count++;
                    stk.pop();
                }
                stk.pop();
                if(count<1)
                {
                    return 1;
                }
            }
            else {
                stk.push(s.charAt(i));
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        String s="((p))";
        System.out.println(checkDuplicateParenthesis(s));
    }
}
