package Strings;

import com.sun.source.tree.WhileLoopTree;

import java.util.Stack;

public class RemoveConsecutiveChars {

    public static  String remove(String s)
    {
        //gfg
        StringBuilder sb=new StringBuilder("");
        sb.append(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            if(sb.charAt(sb.length()-1) != s.charAt(i))
            {
                sb.append(s.charAt(i));
            }
            while (i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                i++;
            }
        }
        return  sb.toString();
    }
    public static  String removeAdjacents(String s)
    {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(stk.empty() || stk.peek()!=s.charAt(i))
            {
                stk.push(s.charAt(i));
            }
            else{
                stk.pop();
            }
        }
        StringBuilder str=new StringBuilder("");
        while (!stk.empty())
        {
            str.append(stk.pop());
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        String str="abbaca";
        System.out.println(removeAdjacents(str));
    }
}
