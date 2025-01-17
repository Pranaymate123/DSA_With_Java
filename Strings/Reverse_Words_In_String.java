package Strings;

import java.util.Locale;
import java.util.Stack;

public class Reverse_Words_In_String {

    public static String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        s=s.trim();
        System.out.println(s);
        Stack<Character> stk=new Stack<>();
        int i=s.length()-1;
        while (i>=0)
        {
            while (i>=0 && s.charAt(i)!=' ')
            {
                stk.add(s.charAt(i));
                i--;
            }
            while (!stk.isEmpty())
            {
                res.append(stk.pop());
            }
            if(i>0)
                res.append(" ");
            while (i>=0 && s.charAt(i)==' ')
            {
                i--;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str="   the   sky   is   blue ";
        System.out.println(reverseWords(str));
    }
}
