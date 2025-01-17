package Revision.Array;

public class Count_And_Say {

    public static String helper(String str)
    {
        StringBuilder result=new StringBuilder();

        int cnt=1;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                cnt++;
            }
            else
            {
                result.append(cnt);
                result.append(str.charAt(i));
                cnt=1;
            }
        }
        result.append(cnt);
        result.append(str.charAt(str.length()-1));
        //123
        return result.toString();
    }
    public static String countAndSay(int n) {
        if(n==1) return "1";
        String str=countAndSay(n-1);

        return helper(str);
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
        
    }
}
