package Accenture_Coding_Pyq;

public class IntegerToBinaryString {

    public static String convertToBinary(int n)
    {
        StringBuilder str=new StringBuilder();
        while (n>0)
        {
            int rem=n%2;
            str.append(rem);
            n=n/2;
        }
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(12));
    }
}
