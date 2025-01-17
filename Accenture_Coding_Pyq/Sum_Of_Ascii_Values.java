package Accenture_Coding_Pyq;

public class Sum_Of_Ascii_Values {
    public static int getSumOfAsciiValues(String str)
    {
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum+= str.charAt(i);
        }  
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getSumOfAsciiValues("ABCD"));
    }
}
