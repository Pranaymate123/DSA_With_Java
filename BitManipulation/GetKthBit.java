package BitManipulation;

public class GetKthBit {
    public static boolean getKthBitSetOrNot(int n,int k)
    {
        int bitMask=1<<k;
        if((n&bitMask)==0)
        {
            //not set
            return false;
        }
        //set
        return true;
    }

    public static int setKthBit(int N,int k)
    {
        int BitMask=1<<k;
        return N | BitMask;
    }

    public static int clearKthBit(int N,int k)
    {
        int BitMask= ~(1<<k);
        return N & BitMask;

    }

    public static int updateIthBit(int N ,int k, int newBit)
    {
        N=clearKthBit(N,k);
        int bitMask=newBit<<k;
        return N| bitMask;

    }
    public static int clearLastKBits(int N,int k)
    {
        int bitMask=(~0)<<k;
        return N & bitMask;
    }

    public static int clearBitsInRange(int N,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;

        int bitMask=a|b;
        return N & bitMask;
    }
    public static boolean checkIfNumber2Power(int N)
    {
        int n=N &(N-1);
        return n == 0;
    }
    public static int getSetBits(int n)
    {
        int count=0;
        while (n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int getFastExponentiation(int a,int n)
    {
        int ans=1;
        while (n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            n=n>>1;
            a=a*a;
        }
        return ans;
    }
    public static void swapWithoutTemp(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(" a = "+a  + "    "+" b = "+b);

    }
    public static void swapUsingExOr(int a,int b)
    {
       a=a^b;
       b=a^b;
       a=a^b;


        System.out.println(" a = "+a  + "    "+" b = "+b);

    }
    public static int addOne(int n)
    {
        return -(~(n));
    }
    public static void convertUpperCaseToLowerCase()
    {
        for( char ch = 'A' ; ch<='Z' ; ch++)
        {
            System.out.print((char) (ch | ' ') + " ");
        }
    }


    public static void main(String[] args) {
//        System.out.println(getKthBitSetOrNot(10,3));
//        System.out.println(setKthBit(10,2));
//        System.out.println(clearKthBit(10,2));
//        System.out.println(updateIthBit(10,2,1));
//        System.out.println(clearLastKBits(15,2));
//        System.out.println(clearBitsInRange(10,2,4));
//        System.out.println(checkIfNumber2Power(4));
//        System.out.println(checkIfNumber2Power(8));
//        System.out.println(checkIfNumber2Power(10));
//        System.out.println(getSetBits(7));
//          System.out.println(getFastExponentiation(5,3));
//        System.out.println(5^5);

//        swapWithoutTemp(5,4);
//        System.out.println(addOne(5));
//        swapUsingExOr(5,4);
            convertUpperCaseToLowerCase();
    }
}
