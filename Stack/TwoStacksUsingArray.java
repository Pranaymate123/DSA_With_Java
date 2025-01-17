package Stack;

public class TwoStacksUsingArray {

   static int [] arr=new int[100];
   static int top1=0;
   static int top2= arr.length-1;

    public TwoStacksUsingArray()
    {
        arr=new int[100];
        top1=-1;
        top2=arr.length;
    }

    public static void push1(int x)
    {
        if(top1 < top2)
        {
            System.out.println("Push1 called");
            top1++;
            arr[top1]=x;

        }
    }
    public static void push2(int x)
    {
        if(top1 < top2)
        {
            top2--;
            arr[top2]=x;

        }
    }

    public static int pop1()
    {
        if(top1>=0)
        {

            int data=arr[top1];
            arr[top1]=0;
            top1--;
            return data;
        }
            return -1;

    }
    public static int pop2()
    {
        if(top2>top1)
        {

            int data=arr[top2];
            arr[top2]=0;
            top2++;
            return data;
        }
        return -1;
    }

    public static int peek1()
    {
        if(top1>=0)
            return arr[top1];
        return -1;
    }
    public static int peek2()
    {
        if(top2<= arr.length-1)
        {
            return arr[top2];
        }
        return -1;
    }


    public static void main(String[] args) {
        push1(10);
        System.out.println(peek1());
        push1(20);
        System.out.println(peek1());
        push1(30);
        System.out.println(peek1());
        push2(11);
        System.out.println(peek2());
        push2(12);
        System.out.println(peek2());
        push2(13);
        System.out.println(peek2());


        System.out.println("Popping  1");
        System.out.println(pop1());
        System.out.println(pop1());
        System.out.println(pop1());

        System.out.println("Popping  2");
        System.out.println(pop2());
        System.out.println(pop2());
        System.out.println(pop2());




    }



}
