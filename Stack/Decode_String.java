package Stack;

import java.util.Stack;

public class Decode_String {
    public static String decodeString(String s) {
//        Stack<String> stack = new Stack<>();
//        int curNum = 0;
//        String curString = "";
//
//        for (char c : s.toCharArray()) {
//            if (c == '[') {
//                stack.push(curString);
//                stack.push(String.valueOf(curNum));
//                curString = "";
//                curNum = 0;
//            } else if (c == ']') {
//                int num = Integer.parseInt(stack.pop());
//                String prevString = stack.pop();
//                StringBuilder sb = new StringBuilder(prevString);
//                for (int i = 0; i < num; i++) {
//                    sb.append(curString);
//                }
//                curString = sb.toString();
//            } else if (Character.isDigit(c)) {
//                curNum = curNum * 10 + (c - '0');
//            } else {
//                curString += c;
//            }
//        }
//        return curString;
        Stack<String> stk=new Stack<>();
        String currString="";
        int currNum=0;
        for(char c:s.toCharArray())
        {
            if(c=='[')
            {
                stk.push(currString);
                stk.push(String.valueOf(currNum));
                currNum=0;
                currString="";
            } else if (c==']') {
                int num=Integer.parseInt(stk.pop());
                String prevString=stk.pop();
                StringBuilder sb=new StringBuilder(prevString);
                for(int i=0;i<num;i++)
                {
                    sb.append(currString);
                }
                currString=sb.toString();

            } else if (Character.isDigit(c)) {
                currNum=currNum*10 + (c-'0');
            }
            else {
                currString+=c;
            }
        }

        return currString;
    }

    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
