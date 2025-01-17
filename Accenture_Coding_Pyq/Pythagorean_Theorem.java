package Accenture_Coding_Pyq;

public class Pythagorean_Theorem {

    public static int getAnsSideLength(int a,int b)
    {
        return (int)Math.ceil(Math.sqrt((a*a)+(b*b)));
    }

    public static int getEvenOddAns(int n)
    {
        if(n%2==1)
        {
            return getSumOrProduct(n,"sum");
        }
        return getSumOrProduct(n,"even");
    }

    public static int getSumOrProduct(int n,String op)
    {
        int sum=0;
        int product=1;
        while (n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        if(op.equals("sum"))
        {
            return sum;
        }
        return product;
    }

    public static void main(String[] args) {
//        System.out.println(getAnsSideLength(4,3));
        System.out.println(getEvenOddAns(12345));
    }
}
