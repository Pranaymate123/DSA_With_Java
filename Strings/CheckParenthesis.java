package Strings;

import java.util.Stack;

public class CheckParenthesis {

    public static boolean checkParenthesis(String str)
    {
        Stack<Character> stk=new Stack<>();

        if(str.length()<2 || str.charAt(0)==')' || str.charAt(0)==']'||str.charAt(0)=='}' )
        {
            return false;
        }

        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
            {

                stk.push(str.charAt(i));

            }
            else if(!stk.empty()) {

                if ((str.charAt(i) == ')' && stk.peek() == '(') || (str.charAt(i) == '}' && stk.peek() == '{') || (str.charAt(i) == ']' && stk.peek() == '[')) {

                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        if(stk.empty())
        {
            return true;
        }
       return  false;
    }

    public static void main(String[] args) {
        String str="[])";
        System.out.println(checkParenthesis(str));
    }
}
