package Stack;

import java.util.Stack;

public class Construct_Smalllest_Number_From_DI_String {
    public static String smallestNumber(String pattern) {
        Stack<Integer> stk=new Stack<>();
        int count=1;
        StringBuilder result=new StringBuilder();
        int i=0;
        while (i<pattern.length())
        {
            stk.push(count);
            char ch=pattern.charAt(i);
            if(ch=='I')
            {
                while (!stk.isEmpty())
                {
                    result.append(stk.pop());
                }
            }
            count++;
            i++;
        }
        stk.push(count);

        while (!stk.isEmpty())
        {
            result.append(stk.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(smallestNumber("IIIDIDDD"));
    }
}
