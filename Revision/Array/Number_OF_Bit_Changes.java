package Revision.Array;

public class Number_OF_Bit_Changes {

    public static int minChanges(int n, int k) {

        if(n==k) return 0;
        if(n<k) return -1;
        String num1=Integer.toBinaryString(n);
        System.out.println(num1);
        String num3=Integer.toBinaryString(k);
        System.out.println(num3);
        String formattedBinaryString = String.format("%"+num1.length()+"s", num3).replace(' ', '0');

        System.out.println(formattedBinaryString);

        String num2=formattedBinaryString;
        int count=0;
        for(int i=0;i<num1.length();i++)
        {
            if(num1.charAt(i)=='1' && num2.charAt(i)=='0')
            {
                count++;
            }
            else if(num1.charAt(i)=='0' && num2.charAt(i)=='1')
            {
                return -1;
            }
        }

        if(count==0) return -1;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minChanges(7,44));
    }
}
