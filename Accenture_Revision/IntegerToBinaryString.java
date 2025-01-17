package Accenture_Revision;

public class IntegerToBinaryString {

    public static String toBinaryString(int n)
    {
        StringBuilder str=new StringBuilder();
        while (n>0)
        {
            int rem=n%2;
            str.append(rem);
            n=n/2;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toBinaryString(6));
    }
}
