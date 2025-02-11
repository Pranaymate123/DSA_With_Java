package Tree_DataStructure;

public class Remove_All_The_Occurences_Of_SubString {

    public static String removeOccurrences(String s, String part) {
        StringBuilder result=new StringBuilder();
        int n=part.length();
        char ch=part.charAt(part.length()-1);
        for(int i=0;i<s.length();i++)
        {
            result.append(s.charAt(i));
            if(result.length()>=n)
            {
                if(result.charAt(result.length()-1)==ch)
                {
                    boolean flag=check(result,part);
                    if(flag)
                    {
                        result.delete(result.length()-n,result.length());
                    }
                }
            }



        }
        return result.toString();
    }
    public static boolean check(StringBuilder result,String part)
    {
        int m=result.length();
        int n=part.length();

        int i=m-1;
        int j=n-1;

        while (j>=0)
        {
            if(result.charAt(i)!=part.charAt(j))
            {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String str=new String("daabcbaabcbc");

        System.out.println( removeOccurrences(str,"abc"));



    }

}
