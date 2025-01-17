package Stack;

import java.util.Stack;

public class Remove_Stars_From_String {

    public static String removeStars(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                stk.pop();
            }
            else {
                stk.push(s.charAt(i));
            }
        }
        StringBuilder res=new StringBuilder("");
        while (!stk.isEmpty())
        {
            res.append(stk.pop());
        }
        res=res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        String s="erase*****";
        System.out.println(removeStars(s));
    }
}
