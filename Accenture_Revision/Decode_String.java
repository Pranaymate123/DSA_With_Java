package Accenture_Revision;

public class Decode_String {

    public static String decodeString(String str)
    {
        int cnt=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                cnt++;
            }
            else
            {
                char ch= (char) ('A'+ cnt-1);

                ans.append(ch);
                cnt=0;
            }
        }
        ans.append((char)('A'+cnt-1));
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("10111011"));
    }
}
