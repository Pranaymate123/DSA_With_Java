package Accenture_Coding_Pyq;

public class Interchange_Characters_Of_String {

    public static String getResult(String str,char ch1,char ch2)
    {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==ch1)
            {
                result.append(ch2);
            }
            else if(ch==ch2)
            {
                result.append(ch1);
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str="pranay";
        System.out.println(getResult(str,'a','p'));
    }
}
