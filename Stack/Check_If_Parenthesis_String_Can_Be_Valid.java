package Stack;

import java.util.Stack;

public class Check_If_Parenthesis_String_Can_Be_Valid {


    public static boolean canBeValid(String s, String locked) {

        int openCount=0;
        int closedCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || locked.charAt(i)=='0')
            {
                openCount++;
            }
            else
            {
                openCount--;
                if(openCount<0) return false;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==')' || locked.charAt(i)=='0')
            {
                closedCount++;
            }
            else
            {
                closedCount--;
                if(closedCount<0) return false;
            }
        }

        return (openCount>0 && closedCount>0);
    }

//    public static boolean canBeValid(String s, String locked) {
//
//        Stack<Integer> open=new Stack<>();
//        Stack<Integer> openClosed=new Stack<>();
//
//        for(int i=0;i<s.length();i++)
//        {
//            char ch=s.charAt(i);
//            char lch=locked.charAt(i);
//            if(lch=='0')
//            {
//                openClosed.push(i);
//            }
//            else {
//                if(ch=='(')
//                {
//                    open.push(i);
//                }
//                else
//                {
//                    //check if open stack have open bracket
//                    if(!open.isEmpty())
//                    {
//                        open.pop();
//                    }
//                    else if(!openClosed.isEmpty())
//                    {
//                        openClosed.pop();
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                }
//            }
//        }
//
//        while (!open.isEmpty() && !openClosed.isEmpty() && open.peek() < openClosed.peek())
//        {
//            open.pop();
//            openClosed.pop();
//        }
//
//        return open.isEmpty();
//    }

    public static void main(String[] args) {
        System.out.println(canBeValid("))()))","010100"));
    }
}
