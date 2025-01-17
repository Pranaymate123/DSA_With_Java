package March;

public class D01_MaxOddBinaryNumber {

    public static String maximumOddBinaryNumber(String s) {
        int oneCount=0;
        int zeroCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1') oneCount++;
            else zeroCount++;
        }
        StringBuilder result=new StringBuilder("");

        while (oneCount>1)
        {
            result.append('1');
            oneCount--;
        }
        while (zeroCount!=0)
        {
            result.append('0');
            zeroCount--;
        }
        if(oneCount==1)
            result.append('1');

        return result.toString();
    }

    public static void main(String[] args) {
        String s="00000";
        System.out.println(maximumOddBinaryNumber(s));
    }
}
