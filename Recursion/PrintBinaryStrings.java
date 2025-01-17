package Recursion;

public class PrintBinaryStrings {

    public static void printBinaryStringsWithNoConsecutiveOnes(int n, int lastPlace,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        printBinaryStringsWithNoConsecutiveOnes(n-1, 0 ,str + "0");

        if(lastPlace == 0)
        {
            printBinaryStringsWithNoConsecutiveOnes(n-1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        printBinaryStringsWithNoConsecutiveOnes(50,0, "");
    }
}
