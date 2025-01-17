package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackExample {
    public  ArrayList<Integer> lst= new ArrayList<>();

    public boolean isEmpty()
    {
        return lst.size()==0;
    }

    //Push

    public void push(int num)
    {
        lst.add(num);
    }
    //pop

    public int pop()
    {
        if(this.isEmpty())
        {
            return -1;
        }
        int top=lst.get(lst.size()-1);
        lst.remove(lst.size()-1);

        return top;
    }

    // peek
    public int peek()
    {
        if(this.isEmpty())
        {
            return -1;
        }
        return lst.get(lst.size()-1);
    }

    public static void main(String[] args) {
        StackExample stk=new StackExample();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        while(!stk.isEmpty())
        {
            System.out.println(stk.peek());
            stk.pop();
        }


    }
}
