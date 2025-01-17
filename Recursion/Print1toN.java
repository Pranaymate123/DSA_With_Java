package Recursion;

public class Print1toN {


    public static void print(int n)
    {
       if(n>0)
       {
           print(n-1);
           System.out.println(n);
       }
    }

//    public  static void printNto1(int n)
//    {
//        if(n>0) {
//            System.out.println(n);
//            printNto1(n - 1);
//        }
//    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void printnTO1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printnTO1(n-1);

    }

    public static void main(String[] args) {
//       print(7);
//       printNto1(7);
//        System.out.println(fact(5));
//        printnTO1(10);

    }
}
