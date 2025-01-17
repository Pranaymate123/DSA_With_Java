package Recursion.CodeStoryWithMik;

import java.util.Stack;

public class ReverseStack {

    static void reverse(Stack<Integer> stk)
    {
        //base case
        if(stk.isEmpty()) return;

        int top=stk.pop();

        reverse(stk);
        insertAtBottom(stk,top);
    }
    public static void insertAtBottom(Stack<Integer> stk,int num)
    {
        //base case
        if(stk.isEmpty())
        {
            stk.push(num);
            return;
        }

        int top=stk.pop();

        insertAtBottom(stk,num);
        stk.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();



        stk.push(6);
        stk.push(7);
        stk.push(1);
        stk.push(2);
        stk.push(3); // Top eleemnt
        System.out.println("Stk is "+ stk);
        reverse(stk);
        System.out.println("Reversed Stk is "+ stk);





    }
}
