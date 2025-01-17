package Stack;

import java.util.Stack;

public class PostFixEvaluation {

    public static int eval(String str)
    {
        Stack<Integer> stk =new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i)<='9')
            {
                stk.push(str.charAt(i)- '0');
            }
            else{
                int op2=stk.pop();
                int op1=stk.pop();

                int operator=str.charAt(i);

                if(operator=='+')
                {
                    stk.push(op1+op2);
                }
               else if(operator=='-')
                {
                    stk.push(op1-op2);
                }
               else  if(operator=='*')
                {
                    stk.push(op1*op2);
                }
               else  if(operator=='/')
                {
                    stk.push(op1/op2);
                } else if (operator == '^') {

                   stk.push((int)Math.pow(op1,op2));

                }
            }
        }
        return stk.peek();
    }

    public static void main(String[] args) {
        System.out.println(eval("231*+9-"));
    }
}
