package Strings;

public class Check_If_Digits_Are_Equal_After_Operations_1 {

    public static boolean hasSameDigits(String s) {

        StringBuilder result=new StringBuilder();
        int n=s.length();
        while (n>2)
        {
            result=new StringBuilder();
            for(int i=0;i<n-1;i++)
            {
                int num=((s.charAt(i)-'0') + (s.charAt(i+1)-'0') ) % 10;
                result.append(num);
            }
            s=result.toString();
            n--;
        }
        if(result.length()==2)
            return result.charAt(0)==result.charAt(1);
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasSameDigits("3902"));
    }
}
