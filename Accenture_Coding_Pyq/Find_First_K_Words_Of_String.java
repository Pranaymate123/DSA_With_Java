package Accenture_Coding_Pyq;

public class Find_First_K_Words_Of_String {
    public static String getFirstKwords(String str,int k)
    {
        int i=0;
        while (k>0 && i<str.length())
        {
            if(str.charAt(i)==' ')
            {
                k--;
                if(k==0) return str.substring(0,i);
            }
            i++;
        }
        return str.substring(0,i);
    }
    public static void main(String[] args) {
        String str="Java is My One Of the favourite Language";
        System.out.println(getFirstKwords(str,8));
    }
}
